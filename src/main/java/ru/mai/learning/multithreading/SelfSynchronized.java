package ru.mai.learning.multithreading;

public class SelfSynchronized {

    public static void main(String[] args) {
        staticMethod();
        SelfSynchronized myObject = new SelfSynchronized();
        myObject.notStaticMethod();
    }

    static synchronized void staticMethod() { //synchronized(SelfSynchronized.class)
        System.out.println("f1");
    }

    synchronized void notStaticMethod() { //synchronized(this)
        System.out.println("non-static method");
    }

}
