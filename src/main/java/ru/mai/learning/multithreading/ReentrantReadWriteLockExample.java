package ru.mai.learning.multithreading;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockExample {
    static final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    static final ReentrantReadWriteLock.ReadLock rl = rwl.readLock();
    static final ReentrantReadWriteLock.WriteLock wr = rwl.writeLock();

    static void sleepSec() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                if (!rl.tryLock()) {
                    System.out.println("can't read now");
                    sleepSec();
                } else {
                    System.out.println("reading");
                    sleepSec();
                    System.out.println("finished reading");
                    rl.unlock(); //in finally
                }
                sleepSec();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                if (!rl.tryLock()) {
                    System.out.println("can't read now");
                    sleepSec();
                } else {
                    System.out.println("reading");
                    sleepSec();
                    System.out.println("finished reading");
                    rl.unlock(); //in finally
                }
                sleepSec();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                if (!wr.tryLock()) {
                    System.out.println("can't write now");
                    sleepSec();
                } else {
                    System.out.println("writing");
                    sleepSec();
                    System.out.println("finished writing");
                    wr.unlock(); //in finally
                }
                sleepSec();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                if (!wr.tryLock()) {
                    System.out.println("can't write now");
                    sleepSec();
                } else {
                    System.out.println("writing");
                    sleepSec();
                    System.out.println("finished writing");
                    wr.unlock(); //in finally
                }
                sleepSec();
            }
        }).start();
    }

}
