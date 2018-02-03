package ru.mai.learning.primitives;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.primitives.Ints.asList;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> sorted = sort(asList(4, 7, 3, 1, 5, 3, 8, 5, 1));
        sorted.forEach(System.out::println);
    }

    public QuickSort() {
        super();
    }

    static List<Integer> sort(List<Integer> src) {
        if (src.size() <= 1) {
            return src;
        }
        int base = src.get(src.size() / 2);
        int baseCount = 0;
        List<Integer> left = new ArrayList<>(src.size());
        List<Integer> right = new ArrayList<>(src.size());

        for (Integer e : src) {
            int comparison = e.compareTo(base);
            if (comparison < 0) {
                left.add(e);
            } else if (comparison > 0) {
                right.add(e);
            } else {
                baseCount++;
            }
        }
        List<Integer> result = new ArrayList<>(src.size());
        result.addAll(sort(left));
        for (int i = 0; i < baseCount; i++) {
            result.add(base);
        }
        result.addAll(sort(right));
        return result;
    }

}
