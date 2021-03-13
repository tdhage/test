package com.td.test.core;

import java.util.HashMap;

public final class ImmutableFinalClassExample {

    private final int id;

    private final String name;

    private final HashMap<String, String> testMap;

    /**
     * Constructor performing Deep Copy
     */

    public ImmutableFinalClassExample(int i, String n, HashMap<String, String> hm) {
        System.out.println("Performing Deep Copy for Object initialization");
        this.id = i;
        this.name = n;
        HashMap<String, String> tempMap = new HashMap<>();
        String key;
        for (String s : hm.keySet()) {
            key = s;
            tempMap.put(key, hm.get(key));
        }
        this.testMap = tempMap;
    }

    /**
     * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
     *
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "first");
        hashMap.put("2", "second");

        String str = "original";

        int i = 10;

        ImmutableFinalClassExample immutableFinalClassExample = new ImmutableFinalClassExample(i, str, hashMap);

        //Lets see whether its copy by field or reference
        System.out.println(i == immutableFinalClassExample.getId());
        System.out.println(str == immutableFinalClassExample.getName());
        System.out.println(hashMap == immutableFinalClassExample.getTestMap());
        //print the immutableFinalClassExample values
        System.out.println("immutableFinalClassExample id:" + immutableFinalClassExample.getId());
        System.out.println("immutableFinalClassExample name:" + immutableFinalClassExample.getName());
        System.out.println("immutableFinalClassExample testMap:" + immutableFinalClassExample.getTestMap());
        System.out.println("immutableFinalClassExample hashcode :" + immutableFinalClassExample);

        //change the local variable values
        i = 20;
        str = "modified";
        hashMap.put("3", "third");
        //print the values again
        System.out.println("immutableFinalClassExample id after local variable change:" + immutableFinalClassExample.getId());
        System.out.println("immutableFinalClassExample name after local variable change:" + immutableFinalClassExample.getName());
        System.out.println("immutableFinalClassExample testMap after local variable change:" + immutableFinalClassExample.getTestMap());
        System.out.println("immutableFinalClassExample hashcode :" + immutableFinalClassExample);

        HashMap<String, String> hmTest = immutableFinalClassExample.getTestMap();
        hmTest.put("4", "new");
        //hashMap.putAll(hmTest);
        System.out.println("immutableFinalClassExample testMap after changing variable from accessor methods:" + immutableFinalClassExample.getTestMap());
        System.out.println("immutableFinalClassExample hashcode :" + immutableFinalClassExample);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    /**
     * Constructor performing Shallow Copy
     * @param i
     * @param n
     * @param hm
     */
    /* public ImmutableFinalClassExample(int i, String n, HashMap<String,String> hm){
     System.out.println("Performing Shallow Copy for Object initialization");
     this.id=i;
     this.name=n;
     this.testMap=hm;
     }
*/

    /**
     * Accessor function for mutable objects
     */
    public HashMap<String, String> getTestMap() {
        //return testMap;
        return (HashMap<String, String>) testMap.clone();
    }

}