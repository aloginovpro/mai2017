package ru.mai.learning.classes.visibility;

public class LazySingleton {

    private static LazySingleton INSTANCE; // = null by default

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    private LazySingleton() { //public by default

    }

    public void printHello() {
        System.out.println("hello!");
    }

}
