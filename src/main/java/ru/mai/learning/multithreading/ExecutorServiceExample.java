package ru.mai.learning.multithreading;

import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<?> future1 = ex.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "1";
        });

        Future<?> future2 = ex.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "2";
        });


        while (true) {
            try {
                System.out.println(future1.get(10, TimeUnit.MILLISECONDS));
                return;
            } catch (TimeoutException ignored) {}
            try {
                System.out.println(future2.get(10, TimeUnit.MILLISECONDS));
                return;
            } catch (TimeoutException ignored) {}
        }

//        ex.shutdown();
    }

}
