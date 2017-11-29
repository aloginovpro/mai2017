package ru.mai.learning.classes.generics.comparator;

import java.util.Comparator;

public class NotComparableComparator implements Comparator<NotComparable> {

    public int compare(NotComparable o1, NotComparable o2) {
        /*
        if (o1.value > o2.value) {
            return 1;
        } else if (o1.value < o2.value) {
            return -1;
        } else {
            return 0;
        }
        */
        return o1.value - o2.value; //bad practice
    }

}
