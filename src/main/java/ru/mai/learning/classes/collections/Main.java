package ru.mai.learning.classes.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(5);
        queue.add(1);
        queue.add(null);
        queue.add(10);

        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.poll());


    }

    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(null);
        list.add(10);
//        for (Integer e : list) {
//            System.out.println(e);
//        }
        System.out.println(list.get(2));
        System.out.println(list.indexOf(20));
    }

}
