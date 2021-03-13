package com.td.test.sophos;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;


        int largest = getLargest(arr, k);
        System.out.println(largest);
    }

    private static int getLargest(int[] array, int k) {
        int[] sortedArray = sortArray(array);
        return sortedArray[sortedArray.length - k];
    }

    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


}
