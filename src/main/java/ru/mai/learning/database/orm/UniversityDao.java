package ru.mai.learning.database.orm;


import ru.mai.learning.database.orm.model.University;

import java.sql.SQLException;
import java.util.List;

public class UniversityDao {

    private final OrmService ormService = new OrmService();

    public UniversityDao() throws SQLException {
    }

    public List<University> loadAll() {
        return ormService.loadList(University.class);
    }

    public static void main(String[] args) throws SQLException {
        UniversityDao universityDao = new UniversityDao();
        List<University> universities = universityDao.loadAll();
    }

}
