package com.td.test.core;

import java.lang.reflect.Constructor;
import java.util.HashMap;

final class Immutable {
    private final int i;
    private final HashMap<String, String> testMap;

    Immutable(int i, HashMap<String, String> map) {
        this.i = i;
        HashMap<String, String> tempMap = new HashMap<>();
        String key;
        for (String s : map.keySet()) {
            key = s;
            tempMap.put(key, map.get(key));
        }
        this.testMap = tempMap;
    }

    public int getI() {
        return i;
    }

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>) testMap.clone();
    }

    /* public void setI(int i) {
        this.i=i;
    }*/


}

public class ImmutableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "first");
        hashMap.put("2", "second");

        System.out.println("1 " + new Immutable(5, hashMap).getTestMap());
        System.out.println("1 " + new Immutable(5, hashMap));
        Immutable instance = new Immutable(5, hashMap);
        System.out.println("2.0 " + instance.getTestMap());
        System.out.println("2.0 " + instance);
        hashMap.put("3", "third");
        System.out.println("2.1 " + instance.getTestMap());
        System.out.println("2.1 " + instance);
        System.out.println("3 " + new Immutable(5, hashMap).getTestMap());
        /*Immutable instance = Immutable.createInstance(5);
        System.out.println(instance);
        instance.setI(6);
        System.out.println(instance);*/

        Immutable reflectionInstance = new Immutable(5, hashMap);
        System.out.println("4 " + reflectionInstance);
        try {
            Constructor<Immutable>[] constructors = (Constructor<Immutable>[]) Immutable.class.getDeclaredConstructors();
            for (Constructor<Immutable> constructor : constructors) {
                constructor.setAccessible(true);
                reflectionInstance = constructor.newInstance(5, hashMap);
            }
            System.out.println("5 " + reflectionInstance);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}