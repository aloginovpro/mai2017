package ru.mai.learning.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);
        new Thread(() -> {
            try {
                latch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("running!");
        }).start();

        new Thread(() -> {
            while (true) {
                latch.countDown();
                System.out.println("count down");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

}
