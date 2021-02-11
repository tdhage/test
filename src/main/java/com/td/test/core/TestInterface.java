package com.td.test.core;

/**
 * A simple Java program to demonstrate multiple inheritance through default methods.
 */
interface TestInterface1 {
    // default method
    default void show() {
        System.out.println("Default TestInterface1");
    }

    // static method
    static void showStatic() {
        System.out.println("Static Method Executed");
    }
}

interface TestInterface2 {
    // Default method
    default void show() {
        System.out.println("Default TestInterface2");
    }
}

// Implementation class code 
public class TestInterface implements TestInterface1, TestInterface2 {
    // Overriding default show method
    public void show() {

        // use super keyword to call the show method of TestInterface1 interface
        TestInterface1.super.show();

        // use super keyword to call the show method of TestInterface2 interface
        TestInterface2.super.show();

        TestInterface1.showStatic();
    }

    public static void main(String[] args) {
        TestInterface d = new TestInterface();
        d.show();
    }
} 

