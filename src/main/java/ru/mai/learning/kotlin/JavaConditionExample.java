package ru.mai.learning.kotlin;

public class JavaConditionExample {

    public static void main(String[] args) {
        final int value = getValue(true);
        System.out.println(value);
    }

    public static int getValue(boolean condition) {
        if (condition) {
            System.out.println("counting if true...");
            return 42;
        } else {
            System.out.println("counting if false...");
            return 0;
        }
    }

}
