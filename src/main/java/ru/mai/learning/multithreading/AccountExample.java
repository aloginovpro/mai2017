package ru.mai.learning.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountExample {

    static final Random r = new Random();

    static class Account {
        final int id;

        int value = 100_000;

        Account(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Account> accounts = new ArrayList<>(10);
        List<Thread> treads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            accounts.add(new Account(i));
        }
        for (int i = 0; i < 15; i++) {
            treads.add(new Thread(() -> transferLoop(accounts)));
        }
        treads.forEach(Thread::start);
        for (Thread tread : treads) {
            tread.join();
        }
        int sum = accounts.stream().mapToInt(a -> a.value).sum();
        accounts.stream().map(a -> a.value).forEach(System.out::println);
        System.out.println(sum);
    }

    static void transferLoop(List<Account> accounts) {
        for (int i = 0; i < 10_000; i++) {
            transfer(accounts);
        }
    }

    static void transfer(List<Account> accounts) {
        int from = r.nextInt(10);
        int to = r.nextInt(10);
        int value = r.nextInt(1000);
        transfer(accounts.get(from), accounts.get(to), value);
    }

    static void transfer(Account from, Account to, int value) {
        if (from == to) {
            return;
        }
        Account first = from.id > to.id ? from : to;
        Account second = from.id < to.id ? from : to;
        synchronized (first) {
            synchronized (second) {
                if (from.value < value) {
                    return;
                }
                from.value -= value;
                to.value += value;
            }
        }
    }

}
