package org.example.Challenges.DailyChallenges.MusicPalindromes;

import java.util.HashMap;
import java.util.Map;

public class PalindromeChecker {
    public static void main(String[] args) {

        String[][] scales = {
                {"Do", "Re", "Mi", "Re", "Do"}
        };
        System.out.printf("%s", reverseScaleAndCheckPalindrome(scales));
    }

    public static String[] reverseScaleAndCheckPalindrome(String[][] scales) {
        // Write code here
        Map<String, Integer> notes = new HashMap<>();
        notes.put("do", 1);
        notes.put("re", 2);
        notes.put("mi", 3);
        notes.put("fa", 4);
        notes.put("sol", 5);
        notes.put("la", 6);
        notes.put("si", 7);

        StringBuilder inputScale = new StringBuilder();
        for(String[] s : scales) {
            for(String singleNote : s) {
                inputScale.append(singleNote);
            }
        }

        System.out.printf("%s", inputScale);

        return null;
    }
}
