package ru.mai.learning.multithreading;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class JavaConcurrentCollections {

    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        Map<Integer, String> map = new ConcurrentHashMap<>();
    }

}
