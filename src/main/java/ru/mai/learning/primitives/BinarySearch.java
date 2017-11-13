package ru.mai.learning.primitives;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[] { };
        System.out.println(search(arr, 1));
    }

    /**
     * @return index of element or -1 if it does not exist
     */
    static int search(int[] arr, int elem) {
        return search(arr, elem, 0, arr.length - 1);
    }

    static int search(int[] arr, int elem, int from, int to) { //from, to - indexes
        if (arr.length == 0) {
            return -1;
        }
        if (from == to) {
            if (arr[from] == elem) {
                return from;
            } else {
                return -1;
            }
        } else {
            int mid = (from + to) / 2;
            int midValue = arr[mid];
            if (midValue == elem) {
                return mid;
            } else if (midValue < elem) {
                return search(arr, elem, mid + 1, to);
            } else { //midValue > elem
                return search(arr, elem, from, mid - 1);
            }
        }
    }

}
