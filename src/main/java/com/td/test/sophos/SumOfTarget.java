package com.td.test.sophos;

import java.util.HashMap;
import java.util.Map;

public class SumOfTarget {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                int sum = array[i] + array[j];
                map.put(sum, " " + i + ", " + j);
            }
        }
        System.out.println(map);
        System.out.println(map.get(target));


    }
}
