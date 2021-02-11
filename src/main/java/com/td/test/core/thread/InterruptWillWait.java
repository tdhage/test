package com.td.test.core.thread;

public class InterruptWillWait {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("End of Main Thread ...");
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("In the Child Thread ... " + i);
            }
            System.out.println("Sleeping now ...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(" I am interrupted ..." + Thread.currentThread().getName());
            }
        }
    }
}