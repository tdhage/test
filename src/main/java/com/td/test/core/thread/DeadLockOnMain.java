package com.td.test.core.thread;

public class DeadLockOnMain {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
        System.out.println("Doesn't reach here ...");
    }
}
