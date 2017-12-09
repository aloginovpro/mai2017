package ru.mai.learning.classes.testing;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDetails getUserDetails(int id) {
        if (id < 0) {
            throw new IllegalUserIdException();
        }

        String name = userDao.getUserName(id);
        return new UserDetails(id, name);
    }


    public static class UserDetails {
        public final int id;
        public final String name;

        UserDetails(int id, String name) {
            this.id = id;
            this.name = name;
        }

    }

}
