package ru.mai.learning.primitives;

public class Conditions {

    public static void main(String[] args) {
        int menuItem = 1;
        if (menuItem == 0) {
            System.out.println("exit");
        } else if (menuItem == 1) {
            System.out.println("save");
        } else {
            System.out.println("print");
        }

        switch (menuItem) {
            case 0:
                System.out.println("exit");
                break;
            case 1:
                System.out.println("save");
                break;
            default:
                System.out.println("print");
        }
        /*
        int signValue;
        boolean isPositive = true;
        if (isPositive) {
            signValue = 1;
        } else {
            signValue = -1;
        }
        */

        boolean isPositive = true;
        int signValue = isPositive ? 1 : -1; //elvis ?: - ternary operator

    }

}
