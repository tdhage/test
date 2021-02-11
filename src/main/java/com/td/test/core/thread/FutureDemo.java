package com.td.test.core.thread;

import java.util.concurrent.*;

/**
 * Java program to show how to use {@link Future} in Java. {@link Future} allows to write asynchronous code in Java,
 * where {@link Future} promises result to be available in future.
 */
public class FutureDemo {
    private static final ExecutorService threadpool = Executors.newFixedThreadPool(3);

    public static void main(String args[]) throws InterruptedException, ExecutionException {
        int number = 12;
        FactorialCalculator task = new FactorialCalculator(number);
        System.out.println("Submitting Task ...");
        Future<Long> future = threadpool.submit(task);
        System.out.println("Task is submitted");
        while (!future.isDone()) {
            System.out.println("Task is not completed yet....");
            Thread.sleep(1000);
            //sleep for 1 millisecond before checking again }
            System.out.println("Task is completed, let's check result");
            Long factorial = future.get();
            System.out.println("Factorial of " + number + " is : " + factorial);
            threadpool.shutdown();
        }
    }

    private static class FactorialCalculator implements Callable<Long> {
        private final int number;

        public FactorialCalculator(int number) {
            this.number = number;
        }

        @Override
        public Long call() {
            long output = 0;
            try {
                output = factorial(number);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            return output;
        }

        private long factorial(int number) throws InterruptedException {
            if (number < 0) {
                throw new IllegalArgumentException("Number must be greater than zero");
            }

            long result = 1;
            while (number > 0) {
                result = result * number;
                number--;
            }
            return result;
        }
    }
}