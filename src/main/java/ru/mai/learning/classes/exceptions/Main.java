package ru.mai.learning.classes.exceptions;

public class Main {

    public static void main(String[] args) {
        System.out.println(getB());
        try {
            throw new RuntimeException();
        } catch (LightException e) {
            System.out.println("don't care");
        } catch (DisasterException e) {
            System.out.println("omg!!!");
        } finally {
            System.out.println("finally");
            int a = 0 / 0;
        }
        System.out.println("After exception");
//        int a = 10;
//        int b = 0;
//        System.out.println(a / b);

    }

    static boolean getB1() {
        boolean result;
        try {
            result = true;
        } finally {
            result = false;
        }
        return result;
    }

    static boolean getB() {
        try {
            return true;
        } finally {
            return false;
        }
    }

}
