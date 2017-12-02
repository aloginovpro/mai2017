package ru.mai.learning.classes.collections;

import com.google.common.collect.ImmutableSet;

import java.util.*;

public class Hashed {

    @Override
    public int hashCode() {
        Random r = new Random(); //bad practice
        return r.nextInt(5);
    }

    public static void main(String[] args) {
        Hashed h1 = new Hashed();
        Hashed h2 = new Hashed();

        Map<Hashed, String> map = new HashMap<Hashed, String>();
        map.put(h1, "Hello");
        map.put(h2, "World");

        Collection<String> values = map.values();

        System.out.println(map.size());
        System.out.println(map.get(h1));
        System.out.println(map.get(h2));

        System.out.println("-------");

        Set<String> mySet = new HashSet<String>();
        mySet.add("Hello");
        mySet.add("World");
        mySet.add("Hello");
        System.out.println(mySet.size());
        for (String element : mySet) {
            System.out.println(element);
        }

        Collection<String> maybeNotDistinct = new ArrayList<String>();
        maybeNotDistinct.add("123");
        maybeNotDistinct.add("456");
        maybeNotDistinct.add("123");

        System.out.println("123".equals("123"));

        Set<String> distinct = new HashSet<String>(maybeNotDistinct);
        for (String element : distinct) {
            System.out.println(element);
        }

        Set<String> immutable = ImmutableSet.of("123", "456", "123");
        immutable.add("qqq");

    }

}













