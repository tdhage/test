package com.td.test.hackerrank;

import java.util.Scanner;

/**
 * 2
 * 5
 * 2 1 5 3 4
 * 5
 * 2 5 1 3 4
 */
public class NewYearChaos {
    private static final Scanner scanner = new Scanner(System.in);
    private static int bribesCount = 0;
    private static boolean chaotic;

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                chaotic = true;
                break;
            }
            for (int j = 0; j < i; j++) {
                if (q[j] > q[i]) {
                    bribesCount++;
                }
            }
        }
        if (chaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribesCount);
        }
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }
            minimumBribes(q);
        }
        scanner.close();
    }

}
