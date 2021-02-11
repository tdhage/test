package com.td.test.core.thread;

public class DefineThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setPriority(Thread.MAX_PRIORITY); // Depends upon OS if it supports Thread priority
        myThread.start();
        myThread.join(5000);
        // myThread.interrupt();
        for (int i =0; i<5; i++ ) {
            System.out.println("In the Main Thread ...");
        }
        // myThread.run();  -- Does not create new Thread here
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getPriority());
            for (int i =0; i<5; i++ ) {
                System.out.println("In the Child Thread ...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Thread.yield();
            }
        }
    }
}
