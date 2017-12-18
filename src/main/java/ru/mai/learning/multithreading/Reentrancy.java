package ru.mai.learning.multithreading;

public class Reentrancy {
    static final Object mon = new Object();

    public static void main(String[] args) {
        f1();
    }

    static void f1() {
        synchronized (mon) {
            System.out.println("f1 sync");
            f2();
            System.out.println("f1 un-sync");
        }
    }

    static void f2() {
        synchronized (mon) {
            System.out.println("f2 sync");
        }
    }

}
