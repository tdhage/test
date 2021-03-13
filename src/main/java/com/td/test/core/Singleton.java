package com.td.test.core;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static final long serialVersionUID = 8806820726158932906L;

    private static volatile Singleton INSTANCE;

    private Singleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton already initialized");
        }
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                // double-check
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    // implement readResolve method to return the existing instance
    public Object readResolve() {
        return Singleton.getInstance();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}