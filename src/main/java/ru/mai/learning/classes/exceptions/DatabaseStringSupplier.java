package ru.mai.learning.classes.exceptions;

import java.sql.SQLException;

public class DatabaseStringSupplier implements StringSupplier {

    public String get() {
        try {
            return getFromDb();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getFromDb() throws SQLException {
        throw new SQLException();
    }

}
