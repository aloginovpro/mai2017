package ru.mai.learning.classes.testing;

public class Math {

    //a * x + b = 0
    public static Double solve(int a, int b) {
        if (b == 0) {
            return null;
        }
        return ((double) -b) / a;
    }

}
