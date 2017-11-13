package ru.mai.learning.primitives;

public class Procedures {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println(sum(x, y, 3));
        sum(x, y);
        int a = sum(x, y);
        System.out.println(x);
        System.out.println(y);
    }

    static int sum(int a, int b) { //static return_value name (params) { body }
        //name + params = signature
        int result = a + b;
        a = 100;
        b = 200;
        return result;
    }

    static long sum(long a, long b) { //overload = procedures with same name but different sign
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return sum(sum(a, b), c);
    }

    static void print(int a) { //void - no return value
        System.out.println("---" + a + "---");
    }

}
