package ru.mai.learning.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiAccessExample {

    static class Holder {
        int value = 0;
        final AtomicInteger ai = new AtomicInteger(0);
    }

    public static void main(String[] args) throws InterruptedException {
        Holder holder = new Holder();

        Object monitor = new Object();
        Thread thread1 = new Thread(() -> increase(holder, monitor));
        Thread thread2 = new Thread(() -> increase(holder, monitor));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(holder.value);
        System.out.println(holder.ai.get());
    }

    static void increase(Holder holder, Object mon) {
        for (int i = 0; i < 1_000_000; i++) {
//            synchronized (mon) {
                holder.value++;
                holder.ai.incrementAndGet();
//            }
        }
    }

}
