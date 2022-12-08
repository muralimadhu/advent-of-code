package com.madhu.advent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1 {

    public static int getTotalCalories(String inputFile, int topn) throws IOException {
        List<Integer> sums = parseFile(inputFile);
        Collections.sort(sums, Collections.<Integer>reverseOrder());
        int sum = 0;
        for (int i = 0; i < topn; i++) {
            sum += sums.get(i);
        }
        return sum;
    }

    // return list of sums per group
    private static List<Integer> parseFile(String file) throws IOException {
        // File path is passed as string
        File f = new File(file);
        BufferedReader br
                = new BufferedReader(new FileReader(file));
        String st;
        List<Integer> result = new ArrayList();
        int sum = 0;
        while ((st = br.readLine()) != null) {
            if (st.isEmpty()) {
                result.add(sum);
                sum = 0;
            } else {
                sum += Integer.valueOf(st);
            }
        }
        return result;
    }
}
