package ru.mai.learning.multithreading;

public class LazySingleton {

    private static volatile LazySingleton INSTANCE; // = null by default

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }

    private LazySingleton() { //public by default

    }

    public void printHello() {
        System.out.println("hello!");
    }

}
