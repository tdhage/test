package com.td.test.core;

import java.io.*;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        // System.out.println(singleton.clone());
        System.out.println(singleton);

        // Break it through Reflection. Comment private constructor throw statement

        /*Singleton singletonInstance = Singleton.getInstance();
        Singleton reflectionInstance = null;
        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                reflectionInstance = (Singleton) constructor.newInstance();
            }
            System.out.println(reflectionInstance);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }*/

        // Comment readResolve method to test this functionality
        Singleton instance1 = Singleton.getInstance();
        try {
            // Serialize singleton object to a file.
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(instance1);
            out.close();

            // Deserialize singleton object from the file
            ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            Singleton instance2 = (Singleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode: " + instance1.hashCode());
            System.out.println("instance2 hashCode: " + instance2.hashCode());
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
