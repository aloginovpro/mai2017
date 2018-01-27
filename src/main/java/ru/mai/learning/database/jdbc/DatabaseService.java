package ru.mai.learning.database.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService {

    public final Connection conn;

    public DatabaseService() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test?user=root"; //&password=
        conn = DriverManager.getConnection(url);
        conn.setSchema("test");
    }

    public interface RowMapper<T,R> {
        R map(T t) throws SQLException;
    }

    public <T> List<T> loadList(String sql, RowMapper<ResultSet, T> mapper, Object... params) {
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            fillStatement(ps, params);
            List<T> result = new ArrayList<>();
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    T element = mapper.map(rs);
                    result.add(element);
                }
            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void fillStatement(PreparedStatement ps, Object... params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);
        }
    }


}











