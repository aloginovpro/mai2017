package ru.mai.learning.algorithms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Movies {

    private static final SimpleDateFormat sdf
            = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    static class Movie {
        final Date start;
        final Date finish;

        Movie(Date start, Date finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    static class Pair<K,V> {
        public final K left;
        public final V right;

        public Pair(K left, V right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) throws ParseException {
        List<Movie> movies = asList(
                new Movie(
                        sdf.parse("2018-01-01 12:00"),
                        sdf.parse("2018-01-01 13:00")
                ),
                new Movie(
                        sdf.parse("2018-01-01 13:30"),
                        sdf.parse("2018-01-01 14:00")
                )
        );
        System.out.println(canViewAll(movies));
    }

    static boolean canViewAll(Collection<Movie> movies) {
        /*
        List<Pair<Date, Integer>> pairs = new ArrayList<>(movies.size() * 2);
        for (Movie movie : movies) {
            pairs.add(new Pair<>(movie.start, +1));
            pairs.add(new Pair<>(movie.finish, -1));
        }
        */
        List<Integer> timeline = movies.stream()
                .flatMap(m -> Stream.of(
                        new Pair<>(m.start, +1),
                        new Pair<>(m.finish, -1)
                ))
                .sorted(comparing(p -> p.left))
                .map(p -> p.right)
                .collect(toList());
        int sum = 0;
        for (Integer e : timeline) {
            sum += e;
            if (sum > 1) {
                return false;
            }
        }
        return true;
    }

}
