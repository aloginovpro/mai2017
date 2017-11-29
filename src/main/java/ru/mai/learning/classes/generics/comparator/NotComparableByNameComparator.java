package ru.mai.learning.classes.generics.comparator;

import java.util.Comparator;

public class NotComparableByNameComparator implements Comparator<NotComparable> {

    public int compare(NotComparable o1, NotComparable o2) {
        return o1.name.compareTo(o2.name);
    }

}
