package ru.mai.learning.database.jdbc;

import ru.mai.learning.database.jdbc.model.University;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UniversityDao {

    private DatabaseService databaseService = new DatabaseService();

    public UniversityDao() throws SQLException {
    }

    public List<University> get() {
        return databaseService.loadList(
                "SELECT * FROM universities",
                this::parseUniversity
        );
    }

    public List<University> get(String prefix) {
        return databaseService.loadList(
                "SELECT * FROM universities WHERE name LIKE ?",
                this::parseUniversity,
                prefix + "%"
        );
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
