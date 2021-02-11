package com.td.test.core;

public class NonRepeatingCharacter {
    public static void main(String[] args) throws Exception {

        String str = "aazzzeeeefffmtttdd";

        char temp = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != temp) {
                if (count == 1) {
                    System.out.println(str.charAt(i - 1));
                    break;
                } else {
                    count = 1;
                    temp = str.charAt(i);
                }
            } else {
                count++;
            }
        }
    }
}
