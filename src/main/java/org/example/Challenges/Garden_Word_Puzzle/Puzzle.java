package org.example.Challenges.Garden_Word_Puzzle;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gardenText = scanner.nextLine();
        String[] wordList = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");

        System.out.printf("%s", Arrays.toString(gardenWordPuzzle(gardenText, wordList)));
    }

    public static int[] gardenWordPuzzle(String gardenText, String[] wordList) {
        // Write code here
        int[] tab = new int[wordList.length];
        for(int i = 0; i < wordList.length; i++) {
            tab[i] = gardenText.indexOf(wordList[i]);
        }
        return tab;
    }
}
