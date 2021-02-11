package com.td.test.core;

import java.lang.reflect.Constructor;

class Immutable {
    private int i;

    private Immutable(int i) {
        this.i = i;
    }

    public static Immutable createInstance(int i) {
        return new Immutable(i);
    }

    public int getI() {
        return i;
    }
}

public class ImmutableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(Immutable.createInstance(5));
        System.out.println(Immutable.createInstance(5));
        System.out.println(Immutable.createInstance(5));

        Immutable reflectionInstance = null;
        try {
            Constructor[] constructors = Immutable.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                reflectionInstance = (Immutable) constructor.newInstance(5);
            }
            System.out.println(reflectionInstance);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}