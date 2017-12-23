package ru.mai.learning.database;

import ru.mai.learning.database.model.University;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UniversityDao {

    public final Connection conn;

    public UniversityDao() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test?user=root"; //&password=
        conn = DriverManager.getConnection(url);
        conn.setSchema("test");
    }

    public List<University> get() throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM universities");
        return parseUniversity(ps);
    }

    public List<University> get(String prefix) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM universities WHERE name LIKE ?");
        ps.setString(1, prefix + "%");
        return parseUniversity(ps);
    }

    private List<University> parseUniversity(PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.executeQuery();
        List<University> result = new ArrayList<>();
        while (rs.next()) {
            result.add(parseUniversity(rs));
        }
        return result;
    }

    private University parseUniversity(ResultSet rs) throws SQLException {
        return new University(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("foundation")
        );
    }

    public static void main(String[] args) throws SQLException {
        UniversityDao universityDao = new UniversityDao();
        universityDao.get("me").forEach(System.out::println);
    }

}
