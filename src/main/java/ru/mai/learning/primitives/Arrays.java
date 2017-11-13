package ru.mai.learning.primitives;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 6, 3, 2, 1, 2}; //can be empty
//        System.out.println(arr[100]); //ArrayIndexOutOfBoundsException

        System.out.println("length = " + arr.length);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i + " -> " + arr[i]);
//        }

        //for each
        for (int e : arr) {
            System.out.println(e);
        }

//        long[] longArr = arr; //no casting

    }

    public static void main1(String[] args) {
        int[] arr = new int[5];
        //default value for array: int -> 0, float -> 0.0, boolean -> false

        for (int i = 0; i < 3; i++) {
            arr[i] = i; //write
        }

        for (int i = 0; i < 5; i++) {
            int value = arr[i]; //i - index, read value from array by index
            System.out.println(value);
        }
    }

}
