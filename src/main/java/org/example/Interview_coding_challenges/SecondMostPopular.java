package org.example.Interview_coding_challenges;

import java.util.HashMap;
import java.util.Map;

public class SecondMostPopular {
    public static void main(String[] args) {
        System.out.printf("%d", secondMost(new int[]{98, 72, 93, 72, 83, 98, 72, 44, 25, 53, 43, 98, 81, 98}));
    }

    public static int secondMost(int[] a) {
        // Write code here
        Map<Integer, Integer> popularity = new HashMap<>();
        for(int num : a) {
            popularity.put(num, popularity.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        int secondMax = 0;
        int FirstMost = -1;
        int secondMost = -1;

        for(var entry : popularity.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if(count > max) {
                secondMax = max;
                secondMost = FirstMost;
                max = count;
                FirstMost = num;
            } else if (count > secondMax) {
                secondMax = count;
                secondMost = num;
            }
        }
        return secondMost;
    }
}
