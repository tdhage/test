package com.td.test.core;


import java.io.IOException;

class Base {
    void m1() throws Exception {
        System.out.println("In m1 A");
    }
}

class Child extends Base {
    void m1() throws IOException {
        System.out.println("In m1 B");
    }
}

public class BaseChildTest {

    public static void main(String[] args) {
        Base base = new Child();
        try {
            base.m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}