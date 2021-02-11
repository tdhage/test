package com.td.test.hackerrank;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {



    // Complete the countSpecialElements function below.
    static int countSpecialElements(List<List<Integer>> matrix) {

        List<Integer> rowMax = new ArrayList<>();
        List<Integer> rowMin = new ArrayList<>();
        List<Integer> colMax = new ArrayList<>();
        List<Integer> colMin = new ArrayList<>();

        for (List<Integer> intergers : matrix) {
            int rmax = Integer.MIN_VALUE;
            int rmin = Integer.MAX_VALUE;
            for (Integer integer : intergers) {
                if (integer > rmax) {
                    rmax = integer;
                }
                if (integer < rmin) {
                    rmin = integer;
                }
            }
            rowMax.add(rmax);
            rowMin.add(rmin);
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int matrixRows = Integer.parseInt(bufferedReader.readLine().trim());
        int matrixColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, matrixRows).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int res = countSpecialElements(matrix);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
