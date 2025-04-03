package org.example.Challenges.DailyChallenges.Buffons_secret_message_decoder;

import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start1 = scanner.nextInt();
        int end1 = scanner.nextInt();
        int start2 = scanner.nextInt();
        int end2 = scanner.nextInt();

//        System.out.println(start1 + " " + end1 + " " + start2 + " " + end2);
        System.out.printf("%s", decodeMessage(sentence, start1, end1, start2, end2));
    }

    public static String decodeMessage(String sentence, int start1, int end1, int start2, int end2) {
        // Write code here
        String part1 = sentence.substring(start1, end1 + 1);
        String part2 = sentence.substring(start2, end2 + 1);

        return part2 + part1;
    }
}
