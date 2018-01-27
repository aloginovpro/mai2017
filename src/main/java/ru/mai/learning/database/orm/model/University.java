package ru.mai.learning.database.orm.model;

import ru.mai.learning.database.orm.annotation.Column;
import ru.mai.learning.database.orm.annotation.Table;

@Table(name = "universities")
public class University {

    public int id;
    public String name;
    @Column(name = "foundation")
    public int year;

}
