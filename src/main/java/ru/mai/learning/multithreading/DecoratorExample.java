package ru.mai.learning.multithreading;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.synchronizedList;

public class DecoratorExample { //implements List<Integer> {

    private final List<Integer> backing = new ArrayList<>();

//    @Override
    public synchronized Integer get(int index) {
        return backing.get(index);
    }

    public static void main(String[] args) {
        List<Integer> list = synchronizedList(new ArrayList<Integer>());


    }

}
