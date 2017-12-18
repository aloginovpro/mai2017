package ru.mai.learning.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    static final ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        f1();
    }

    static void f1() {
        lock.lock();
        try {
            System.out.println("f1: " + lock.getHoldCount());
            f2();
        } finally {
            lock.unlock();
        }
    }

    static void f2() {
        lock.lock();
        try {
            System.out.println("f2: " + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }


}
