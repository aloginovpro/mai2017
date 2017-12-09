package ru.mai.learning.multithreading;

public class TreadExample {

    public static void main(String[] args) throws InterruptedException {


        new Thread(TreadExample::printLoop).start();
        new Thread(TreadExample::printLoop).start();

//        printLoop();

        System.out.println("main finished");
    }

    static void printLoop() {
        for (int i = 0; i < 1_000_000_000; i++) {
            if (i % 1_000_000 == 0) {
                System.out.println(Thread.currentThread());
            }
        }
        System.out.println(Thread.currentThread() + " finished");
    }

}
