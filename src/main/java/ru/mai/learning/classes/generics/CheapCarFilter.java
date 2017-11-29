package ru.mai.learning.classes.generics;

public class CheapCarFilter implements CarFilter {

    public boolean suit(Car v) {
        return v.price <= 55;
    }

}
