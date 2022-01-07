package com.td.test.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumOccurringCharacter {
    private static char printMaxOccurringChar(String inputString) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();

        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

        int maxCount = 0;

        char maxChar = 0;

        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(inputString + " : " + maxChar + " : " + maxCount);
        return maxChar;
    }

    public static void main(String[] args) {

        printMaxOccurringChar("Java Concept Of The Day");

        printMaxOccurringChar("Java J2ee Android Hibernate JSP");

        printMaxOccurringChar("abbcccddddeeeeeffffff");

        printMaxOccurringChar("122333444455555666666");
    }
}
