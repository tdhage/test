package com.td.test.hackerrank;

import java.util.Scanner;

public class PlusMinus {


    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float positive = 0;
        float negative = 0;
        float zero = 0;
        float length = arr.length;

        for (int i : arr) {
            if (i == 0) {
                zero++;
            } else if (i > 0) {
                positive++;
            } else {
                negative++;
            }
        }

        System.out.printf("%.6f%n", positive / length);
        System.out.printf("%.6f%n", negative / length);
        System.out.printf("%.6f%n", zero / length);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
