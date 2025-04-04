package org.example.Interview_coding_challenges;

public class LongestRepetingOnes {
    public static void main(String[] args) {
        System.out.printf("%d", getLongestRepeatingOnes("0110111001011110000000011"));
    }

    public static int getLongestRepeatingOnes(String s) {
        // Write code here
        int longest = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                longest++;
                if (longest > max) {
                    max = longest;
                }
            } else {
                longest = 0;
            }
        }
        return max;
    }
}
