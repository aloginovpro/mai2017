package ru.mai.learning.database.orm;

import ru.mai.learning.database.orm.annotation.Column;
import ru.mai.learning.database.orm.annotation.Table;
import ru.mai.learning.database.orm.model.University;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrmService {

    private final Connection conn;

    public OrmService() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test?user=root"; //&password=
        conn = DriverManager.getConnection(url);
        conn.setSchema("test");
    }

    public <T> List<T> loadList(Class<T> clazz) {
        String tableName = getTableName(clazz);
        try (
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM " + tableName);
                ResultSet rs = ps.executeQuery();
        ) {
            List<T> result = new ArrayList<>();
            while (rs.next()) {
                T element = clazz.newInstance();
                for (Field field : clazz.getFields()) {
                    String columnName = getColumnName(field);
                    Object value = rs.getObject(columnName);
                    field.set(element, value);
                }
                result.add(element);
            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String getColumnName(Field field) {
        Column[] annotations = field.getAnnotationsByType(Column.class);
        return annotations.length != 0
                ? annotations[0].name()
                : field.getName();
    }

    private static <T> String getTableName(Class<T> clazz) {
        Table[] annotations = clazz.getAnnotationsByType(Table.class);
        if (annotations.length == 0) {
            throw new RuntimeException("Class " + clazz.getSimpleName() + " not annotated");
        }
        return annotations[0].name();
    }

    public static void main(String[] args) throws SQLException {
        OrmService ormService = new OrmService();
        ormService.loadList(University.class);
    }

}
