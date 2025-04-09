package org.example.Challenges.DailyChallenges.Stargazers_Night_Sky;

import java.util.Scanner;

public class StarCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialStars = scanner.nextInt();
        int minutes = scanner.nextInt();

        System.out.printf("%s", countStars(initialStars, minutes));
        scanner.close();
    }

    public static String countStars(int initialStars, int minutes) {
        // Write code here
        int finalStars = initialStars + minutes;
        StringBuilder stars = new StringBuilder();
        stars.append("*".repeat(Math.max(0, finalStars)));

        String message1 = "Initial stars: " + initialStars + "\n";
        String message2 = "Final stars: " + finalStars + "\n";
        String message3 = "Minutes spent: " + minutes + "\n";
        String message4 = "Stars: " + stars;
        return message1 + message2 + message3 + message4;
    }
}
