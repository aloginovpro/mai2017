package ru.mai.learning.multithreading;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.CompletableFuture.*;

public class CompletableFutureExample {
    static final ExecutorService ex = Executors.newSingleThreadExecutor();
    static final Random r = new Random();

    public static void main(String[] args) {
        supplyAsync(() -> {
            if (r.nextBoolean()) {
                RuntimeException omg = new RuntimeException("omg");
                throw omg;
            } else {
                return 1;
            }
        })
                .thenApply(r -> {
                    System.out.println("intermediate result: " + r);
                    return r;
                })
                .exceptionally(t -> {
                    t.printStackTrace();
                    return 0;
                })
                /*
                .handle((r, t) -> {
                    if (t != null) {
                        t.printStackTrace();
                        return 0;
                    } else {
                        return r;
                    }
                })
                 */
                .thenAccept(r -> System.out.println("Result: " + r));


    }

    public static void main3(String[] args) {
        CompletableFuture<Integer> cf1 = supplyAsync(() -> {
            sleepRandom();
            return 1;
        }, ex);
        CompletableFuture<Integer> cf2 = supplyAsync(() -> {
            sleepRandom();
            return 2;
        }, ex);
        CompletableFuture<Integer> cfSum = cf1.thenCombine(cf2, (r1, r2) -> r1 + r2);
    }

    static void sleepRandom() {
        try {
            Thread.sleep(r.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main2(String[] args) {
        CompletableFuture<String> cf1 = supplyAsync(() -> {
            sleepRandom();
            return "1";
        }, ex);

        CompletableFuture<String> cf2 = supplyAsync(() -> {
            sleepRandom();
            return "2";
        }, ex);

        anyOf(cf1, cf2)
                .thenAccept(System.out::println);
    }

    public static void main1(String[] args) {
//        CompletableFuture<Void> cf1 = CompletableFuture.runAsync(
//                () -> System.out.println("Hello world"),
//                ex
//        );
//
//        CompletableFuture<String> cf2 = supplyAsync(
//                () -> "Hello world",
//                ex
//        );
//
        final String line = "123";
        supplyAsync(
                () -> Integer.valueOf(line),
                ex
        )
                .thenApply(r -> r * 2)
                .thenApply(r -> "result: " + r)
                .thenAccept(System.out::println);

    }

}
