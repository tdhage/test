package com.td.test.hackerrank;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SocksMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> mapOfSocks = new HashMap<>();

        for (int i=0; i<n; i++) {
            if (mapOfSocks.containsKey(ar[i])) {
                mapOfSocks.put(ar[i], mapOfSocks.get(ar[i]) + 1);
            } else {
                mapOfSocks.put(ar[i], 1);
            }

        }
        int count = 0;
        for(Integer value : mapOfSocks.values()){
            count += value/2;
        }
        System.out.println(count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);


        scanner.close();
    }
}
