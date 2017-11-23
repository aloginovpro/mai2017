package ru.mai.learning.classes.visibility.fabric;

public class User {

    private static final int MAX_USERS = 3;
    private static final User[] users = new User[MAX_USERS];

    private static int idSeq = 0;

    final int id;

    private User(int id) {
        this.id = id;
        System.out.println("constructor");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }

    public static User get() { //fabric
        idSeq++;
        idSeq = idSeq % MAX_USERS; //round robin
        if (users[idSeq] == null) {
            users[idSeq] = new User(idSeq);
        }
        return users[idSeq];
    }


    public static void main(String[] args) {
        System.out.println(User.get());
        System.out.println(User.get());
        System.out.println(User.get());
        System.out.println(User.get());
        System.out.println(User.get());
        System.out.println(User.get());
        System.out.println(User.get());
    }

}
