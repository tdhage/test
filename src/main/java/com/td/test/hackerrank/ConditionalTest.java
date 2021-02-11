package com.td.test.hackerrank;

import java.util.Scanner;

public class ConditionalTest {

    /*
    Task
Given an integer, , perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (number%2==1) {
            System.out.println("Weird");
        }
        else {
            if (number > 20) {
                System.out.println("Not Weird");
            } else if (number >= 6) {
                System.out.println("Weird");
            } else if (number >= 2) {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}
