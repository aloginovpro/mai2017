package ru.mai.learning.primitives;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.primitives.Ints.asList;

public class MergeSort {

    public static void main(String[] args) {
        List<Integer> sorted = sort(asList(4, 7, 3, 1, 5, 3, 8, 5, 1));
        sorted.forEach(System.out::println);
    }

    static List<Integer> sort(List<Integer> src) {
        if (src.size() <= 1) {
            return src;
        }
        int mid = src.size() / 2;
        List<Integer> left = sort(src.subList(0, mid));
        List<Integer> right = sort(src.subList(mid, src.size()));
        return merge(left, right);
    }

    static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>(left.size() + right.size());
        int leftIdx = 0;
        int rightIdx = 0;
        while (leftIdx < left.size() || rightIdx < right.size()) {
            if (leftIdx >= left.size()) {
                result.add(right.get(rightIdx));
                rightIdx++;
            } else if (rightIdx >= right.size()) {
                result.add(left.get(leftIdx));
                leftIdx++;
            } else {
                if (left.get(leftIdx).compareTo(right.get(rightIdx)) < 0) {
                    result.add(left.get(leftIdx));
                    leftIdx++;
                } else {
                    result.add(right.get(rightIdx));
                    rightIdx++;
                }
            }
        }
        return result;
    }



}
