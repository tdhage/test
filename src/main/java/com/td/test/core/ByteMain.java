package com.td.test.core;

public class ByteMain {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        a += b;
        // a = a + b;       // Compilation Error
        System.out.println(a);
    }
}
