package ru.mai.learning.classes.collections;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CollectionExamples {

    public static void main(String[] args) {
        String s = "abcdade";
        s.chars(); //.. ?
    }

    public static void main6(String[] args) {
        String s = "abcdade";
        //a -> 2, b -> 1, c-> 1, ..
        Map<Character, Integer> result = new HashMap<>();
        for (char c : s.toCharArray()) {
            result.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main5(String[] args) {
        Set<String> names = Stream.of(
                Stream.of("Vasya", "Lesha"),
                Stream.of("Alice", "Bob")
        )
                .flatMap(s123 -> s123)
                .collect(toSet());
    }

    public static void main4(String[] args) {
        Optional<String> vasyaOpt = Optional.ofNullable("Vasya");
        int result = vasyaOpt.map(String::length).orElse(null);


//        String vasya = null; //?
//        Integer result = null;
//        if (vasya != null) {
//            result = vasya.length();
//        }

        String city = Stream.of("Moscow", "NY", "London")
                .filter(s -> s.length() == 6)
                .findAny()
                .orElse("no_city");

        System.out.println(city);


    }

    public static void main3(String[] args) {
        Map<Integer, String> map = Stream.of(
                new Player(1, "Vasya"),
                new Player(2, "Lesha")
        ).collect(toMap(p -> p.id, p -> p.name));

        int totalLength = Stream.of("Vasya", "Lesha")
                .mapToInt(String::length)
                .sum();
    }

    static class Player {
        final int id;
        final String name;

        Player(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main2(String[] args) {
        Set<Integer> set = Stream.of("1", "2", "5", "-1", "1")
                .map(s -> {
                    try {
                        return parse(s);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(toSet());
    }

    static Integer parse(String s) throws ParseException {
        try {
            return Integer.valueOf(s);
        } catch (Exception e) {
            throw new ParseException();
        }
    }

    static class ParseException extends Exception {}


    public static void main1(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        list.add(-2);

        List<Integer> list = Arrays.asList(1, 2, 5, -2);

        List<Integer> result = filterEvenStream(list);

//        for (Integer element : result) {
//            System.out.println(element);
//        }

        result.forEach(element -> {
            System.out.println("element:");
            System.out.println(element);
        });

    }

    public class SoutConsumer implements Consumer<Integer> {

        @Override
        public void accept(Integer a) {
            System.out.println(a);
        }
    }

    private static List<Integer> filterEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer element : list) {
            if (element % 2 == 0) { //even
                result.add(element);
            }
        }
        return result;
    }

    private static List<Integer> filterEvenStream(List<Integer> list) {
        Stream<Integer> stream = list.stream()
                .filter(element -> element % 2 == 0)
                .peek(el -> System.out.println("processing: " + el));
        return stream
                .collect(toList());
    }

}
