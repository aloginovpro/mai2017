package ru.mai.learning.classes.inheritance;

public abstract class Animal {

    final String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " eats");
    }

    public abstract void say();

    final void sleep() {
        System.out.println("sleeping");
    }

    abstract Food whatEats();

}
