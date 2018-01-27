package ru.mai.learning.database;

import java.sql.*;

public class DatabaseMain {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test?user=root"; //&password=
        Connection conn = DriverManager.getConnection(url);
        conn.setSchema("test");
        System.out.println(conn.getSchema());

        int minId = 1;
        PreparedStatement ps =
                conn.prepareStatement("SELECT id, name FROM universities WHERE id >= ?");
        ps.setInt(1, minId);
//        ps.setString(2, "msu");
        ResultSet rs = ps.executeQuery();
//        int columnCount = rs.getMetaData().getColumnCount();
        while (rs.next()) {
//            for (int i = 1; i <= columnCount; i++) {
//                System.out.print(rs.getString(i) + " ");
//            }
            System.out.println();
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println("University: " + id + ", " + name);
        }

        ps = conn.prepareStatement("INSERT INTO universities (name, foundation) VALUES (?, ?)");
        ps.setString(1, "miet");
        ps.setInt(2, 1985);
        int rowsAffected = ps.executeUpdate();
        System.out.println("rows affected: " + rowsAffected);
    }

}
