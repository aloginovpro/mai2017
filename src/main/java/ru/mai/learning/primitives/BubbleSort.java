package ru.mai.learning.primitives;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 7, 3, 1, 5, 3, 8, 5, 1 }; //n

        boolean hasSwaps = true;
        while (hasSwaps) { //1 .. n-1
            hasSwaps = false;
            for (int i = 0; i < arr.length - 1; i++) { //n-1
                if (arr[i + 1] < arr[i]) { //have to swap
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    hasSwaps = true;
                }
            }
        }


    }

}
