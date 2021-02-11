package com.td.test.core;

interface A {
    default void foo() {
        System.out.println("Calling A.foo()");
    }
}

interface B {
    default void foo() {
        System.out.println("Calling B.foo()");
    }
}

public class Clazz implements A,B {

    @Override
    public void foo() {
        System.out.println("Calling Both foo()");
        A.super.foo();
        B.super.foo();
    }

    public static void main(String[] args) {
        Clazz clazz = new Clazz();
        clazz.foo();
    }
}
