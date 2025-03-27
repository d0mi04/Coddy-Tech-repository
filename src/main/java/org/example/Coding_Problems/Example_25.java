package org.example.Coding_Problems;

import java.util.Scanner;

public class Example_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matches = scan.nextInt();
        int bestCount = 0;
        for(int i = 0; i < matches; i++) {
            int wins = scan.nextInt();
            int draws = scan.nextInt();
            int loses = scan.nextInt();
            if(bestCount < scoreCount(wins, draws)) {
                bestCount = scoreCount(wins, draws);
            }
        }
        System.out.printf("%d", bestCount);
        scan.close();
    }

    public static int scoreCount(int wins, int draws) {
        return wins * 3 + draws;
    }
}
