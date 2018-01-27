package ru.mai.learning.algorithms;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveIf {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("apple");
        collection.add("orange");
        collection.removeIf(e -> e.startsWith("a"));
        collection.forEach(System.out::println);
    }

}
