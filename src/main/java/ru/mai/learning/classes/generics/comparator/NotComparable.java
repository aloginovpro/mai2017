package ru.mai.learning.classes.generics.comparator;

public class NotComparable {

    final int value;
    final String name;

    public NotComparable(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static void main(String[] args) {
        NotComparable nc1 = new NotComparable(1, "b");
        NotComparable nc2 = new NotComparable(2, "a");
//        int compareResult = nc1.compareTo(nc2);
        NotComparableComparator comparator = new NotComparableComparator();
        int result = comparator.compare(nc1, nc2);
        System.out.println(result);

        NotComparableByNameComparator comparator2 = new NotComparableByNameComparator();
        int result2 = comparator2.compare(nc1, nc2);
        System.out.println(result2);
    }

}
