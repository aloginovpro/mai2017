package ru.mai.learning.classes.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Hashed {

    @Override
    public int hashCode() {
        Random r = new Random();
        return r.nextInt(5);
    }

    public static void main(String[] args) {
        Hashed h1 = new Hashed();
        Hashed h2 = new Hashed();

        Map<Hashed, String> map = new HashMap<Hashed, String>();
        map.put(h1, "Hello");
        map.put(h2, "World");

        System.out.println(map.size());
        System.out.println(map.get(h1));
        System.out.println(map.get(h2));
    }

}
