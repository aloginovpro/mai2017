package ru.mai.learning.classes.visibility;

public class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() { //public by default
        System.out.println("constructor");
    }

    public void printHello() {
        System.out.println("hello!");
    }

}
