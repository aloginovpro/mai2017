package ru.mai.learning.multithreading;

import java.util.Random;

public class WaitAndNotify {

    static final Object mon = new Object();
    static int val = 0;
    static boolean isSet = false;
    static final Random r = new Random();

    public static void main(String[] args) {
        new Thread(WaitAndNotify::waitAndRead).start();
        new Thread(WaitAndNotify::writeAndNotify).start();
    }

    static void writeAndNotify() {
        synchronized (mon) {
            isSet = true;
            val = r.nextInt(10);
            mon.notify();
        }
    }

    static void waitAndRead() {
        synchronized (mon) {
            try {
                while (!isSet) {
                    mon.wait();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(val);
        }
    }


}
