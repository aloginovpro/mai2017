package ru.mai.learning.multithreading;

public class SelfSynchronizedInherited extends SelfSynchronized {

    @Override
    void notStaticMethod() { //may be not synchronized
        super.notStaticMethod();
        System.out.println("non static method inherited");
    }


    public static void main(String[] args) {
        SelfSynchronizedInherited my = new SelfSynchronizedInherited();
        my.notStaticMethod();
    }
}
