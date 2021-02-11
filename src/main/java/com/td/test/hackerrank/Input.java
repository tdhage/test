package com.td.test.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> inputStrings = new ArrayList<>();

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            inputStrings.add(scanner.nextLine());
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }
        inputStrings.forEach(Input::breakStringInEvenOdd);
    }

    private static void breakStringInEvenOdd(String input) {
        StringBuilder evenCharString = new StringBuilder();
        StringBuilder oddCharString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                evenCharString.append(input.charAt(i));
            } else {
                oddCharString.append(input.charAt(i));
            }
        }
        System.out.println(evenCharString + " " + oddCharString);
    }
}
