package com.td.test.core;

public class Test {

    public static void main(String[] args) {
        int[] arr1 = {-1, 1, 3, 5, 7, 9};
        int[] arr2 = {-2, 2, 3, 4, 5, 6};
        sort(arr1, arr2);
    }

    private static int[] sort(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] newArray = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j])
                newArray[k++] = arr1[i++];
            else
                newArray[k++] = arr2[j++];
        }

        while (i < arr1.length) {
            newArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            newArray[k++] = arr2[j++];
        }
        return newArray;
    }
}