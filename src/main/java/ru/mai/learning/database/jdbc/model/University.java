package ru.mai.learning.database.jdbc.model;

public class University {

    public final int id;
    public final String name;
    public final int foundation;

    public University(int id, String name, int foundation) {
        this.id = id;
        this.name = name;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foundation=" + foundation +
                '}';
    }
}
