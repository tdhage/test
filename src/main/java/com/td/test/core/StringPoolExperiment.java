package com.td.test.core;

public class StringPoolExperiment {
 
    public static void main(String[] args) {
        String siteName1 = "java";
        String siteName2 = "java";
        String sitename3 = new String("java");
        String sitename4 = new String("java").intern();
 
        System.out.println(siteName1 == siteName2); // true
        System.out.println(siteName1 == sitename3); // false
        System.out.println(siteName1 == sitename4); // true
    }
}