package ru.mai.learning.primitives;

public class Recursion {

    public static void main(String[] args) {
//        System.out.println(factLoop(5));
//        System.out.println(factRec(5));
        System.out.println(fibRec(20));
    }

    static int factLoop(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i; //result = result * i
        }
        return result;
    }

    static int factRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            int prev = factRec(n - 1);
            return prev * n;
        }
    }

    static int fibRec(int n) {
        if (n == 1 | n == 2) {
            return 1;
        } else {
            return fibRec(n - 1) + fibRec(n - 2);
        }
    }

}
