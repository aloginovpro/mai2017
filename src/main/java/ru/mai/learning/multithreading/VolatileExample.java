package ru.mai.learning.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileExample {

    static volatile int i = 0;

    public static void main(String[] args) {
        new Thread(() -> i++).start();
        new Thread(() -> System.out.println(i)).start();
        new AtomicInteger().getAndIncrement(); //not alt

        if (true) {
            //1
        } else {
            //2
        }
    }

}
