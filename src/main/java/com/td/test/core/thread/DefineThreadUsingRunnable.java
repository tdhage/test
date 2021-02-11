package com.td.test.core.thread;

public class DefineThreadUsingRunnable {
    public static void main(String[] args) {
        Thread.currentThread().setName("Runnable Main");
        System.out.println(Thread.currentThread().getName());
        // int i = 10/0;
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i =0; i<5; i++ ) {
                System.out.println("In the Runnable Thread ...");
            }
            System.out.println(Thread.currentThread().getPriority());
        }
    }
}
