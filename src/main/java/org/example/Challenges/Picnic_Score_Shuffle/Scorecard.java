package org.example.Challenges.Picnic_Score_Shuffle;

import java.util.Scanner;

public class Scorecard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] scoresTab = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");
        String[] correctionsTab = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");
        int[] scores = new int[scoresTab.length];
        int[] corrections = new int[correctionsTab.length];
        for(int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(scoresTab[i]);
            corrections[i] = Integer.parseInt(correctionsTab[i]); // they are both same length
        }

        int[] result = correctScorecard(scores, corrections);
        for(int i : result) {
            System.out.printf("%d,", i);
        }
    }

    public static int[] correctScorecard(int[] scores, int[] corrections) {
        // Write code here
        int[] score = new int[scores.length]; // it will have the same length
        for(int i = 0; i < scores.length; i++) {
            score[i] = Math.max(scores[i] + corrections[i], 0);
        }
        return score;
    }
}
