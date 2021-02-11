package com.td.test.core;

import java.lang.reflect.Field;

public class StringPool {

    // Only work on or before Java 8.

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // add "Hello" to pool
        String hello = "Hello";

        // Change value of "Hello" string to "Buy Buy"
        Field value = hello.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(hello, "Buy Buy".toCharArray());

        // Print "Hello" to console -- The output is Buy Buy
        System.out.println("Hello");
    }
}