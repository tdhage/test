package com.td.test.ds;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int lastIndexInArray = array.length - 1; lastIndexInArray > 0; lastIndexInArray--) {
            for (int i = 0; i < lastIndexInArray; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
