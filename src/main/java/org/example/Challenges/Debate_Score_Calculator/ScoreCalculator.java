package org.example.Challenges.Debate_Score_Calculator;

import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] participantStatements = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");
        String[] judgeWeightsString = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");

        int[] judgeWeight = new int[judgeWeightsString.length];
        for(int i = 0; i < judgeWeight.length; i++) {
            judgeWeight[i] = Integer.parseInt(judgeWeightsString[i]); // they both have the same length, so I am using one loop
        }

        System.out.printf("%d", calculateDebateScore(participantStatements, judgeWeight));
    }

    public static int calculateDebateScore(String[] participantStatements, int[] judgeWeights) {
        // Write code here
        int sum = 0;
        for(String statement : participantStatements) {
            String[] singleStatements = statement.split("\\|");
            for(int i = 0; i < singleStatements.length; i++) {
                sum += Integer.parseInt(singleStatements[i]) * judgeWeights[i];
            }
        }

        return sum;
    }
}
