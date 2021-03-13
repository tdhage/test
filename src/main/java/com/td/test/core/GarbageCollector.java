package com.td.test.core;

public class GarbageCollector {

    public static void main(String[] args) throws InterruptedException {
        GarbageCollector garbageCollector1 = new GarbageCollector();
        GarbageCollector garbageCollector2 = new GarbageCollector();

        // Nullifying the reference variable
        garbageCollector1 = null;

        // requesting JVM for running Garbage Collector
        System.gc();

        // Nullifying the reference variable
        garbageCollector2 = null;

        // requesting JVM for running Garbage Collector
        Runtime.getRuntime().gc();

    }

    // finalize method is called on object once before garbage collecting it
    @Override
    protected void finalize() {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}
