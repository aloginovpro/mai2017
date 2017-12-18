package ru.mai.learning.multithreading;


import java.util.Deque;
import java.util.LinkedList;

public class BlockingQueue {

    private final Object mon = new Object();

    private final int capacity;
    private final Deque<Integer> backing = new LinkedList<>();

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public Integer poll() {
        synchronized (mon) {
            while (backing.isEmpty()) {
                try {
                    mon.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Integer result = backing.poll();
            mon.notifyAll();
            System.out.println("polled, size: " + backing.size());
            return result;
        }
    }

    public void add(Integer a) {
        synchronized (mon) {
            while (backing.size() >= capacity) {
                try {
                    mon.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            backing.add(a);
            mon.notifyAll();
            System.out.println("added, size: " + backing.size());
        }
    }

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue(3);
        new Thread(() -> {
            while (true) {
                blockingQueue.add(5);
            }
        }).start();
        new Thread(() -> {
            while (true) {
                System.out.println(blockingQueue.poll());
            }
        }).start();
    }

}
