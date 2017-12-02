package ru.mai.learning.classes.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("Since15")
public class ArrayReversedIterable<T> implements Iterable<T> {

    private final T[] arr;

    public ArrayReversedIterable(T[] arr) {
        this.arr = arr;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int current = arr.length - 1;

            public boolean hasNext() {
                return current >= 0;
            }

            public T next() {
                if (current < 0) {
                    throw new NoSuchElementException();
                }
                T result = arr[current];
                current--;
                return result;
            }

            @Override
            public void remove() {

            }
        };
    }

    public static void main(String[] args) {
        ArrayReversedIterable<Integer> reversed
                = new ArrayReversedIterable<Integer>(new Integer[]{1, 2, 3});
//        for (Integer element: reversed) {
//            System.out.println(element);
//        }
        Iterator<Integer> iterator = reversed.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}











