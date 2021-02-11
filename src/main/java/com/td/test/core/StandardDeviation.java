package com.td.test.core;

/* Java program to find variance  and standard deviation of given array. */
public class StandardDeviation {
    // Function for calculating variance
    static double variance(double a[], int n) {
        // Compute mean (average of elements)
        double sum = 0;

        for (int i = 0; i < n; i++)
            sum += a[i];
        double mean = sum / n;

        // Compute sum squared differences with mean.
        double sqDiff = 0;
        for (int i = 0; i < n; i++)
            sqDiff += (a[i] - mean) * (a[i] - mean);

        return sqDiff / n;
    }

    static double standardDeviation(double[] arr, int n) {
        return Math.sqrt(variance(arr, n));
    }

    // Driver Code
    public static void main(String[] args) {

        double[] arr = {600, 470, 170, 430, 300};
        int n = arr.length;

        System.out.println("Variance: " + variance(arr, n));
        System.out.println("Standard Deviation: " + standardDeviation(arr, n));

    }
}
