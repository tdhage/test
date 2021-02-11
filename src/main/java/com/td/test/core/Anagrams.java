package com.td.test.core;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Anagrams {
    static StringBuffer sb = new StringBuffer();

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] inputs = br.readLine().trim().split("\\s+");
            TreeMap<String, Integer> map = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                int[] arr = new int[26];

                char[] carr = inputs[i].toCharArray();

                for (char c : carr) {
                    arr[c - 'a']++;
                }

                String s = "";

                for (int j = 0; j < 26; j++) {
                    if (arr[j] > 0) {
                        for (int k = 0; k < arr[j]; k++) {
                            char a = (char) ('a' + j);
                            s = s + a;
                        }
                    }
                }
                int count = 0;
                if (map.containsKey(s)) {
                    count = map.get(s) + 1;
                } else {
                    count = 1;
                }
                map.put(s, count);
            }
            String s = "";
            Iterator hmIterator = map.entrySet().iterator();
            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) hmIterator.next();
                s = mapElement.getValue() + " " + s;
            }
            System.out.println(s);
        }
    }
}