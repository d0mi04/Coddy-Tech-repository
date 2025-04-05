package org.example.Challenges.DailyChallenges.MusicPalindromes;

import java.util.HashMap;
import java.util.Map;

public class PalindromeChecker {
    public static void main(String[] args) {

        String[][] scales = {
                {"'do'", "'re'", "'mi'", "'fa'", "'do'"}
        };
        System.out.printf("%s", reverseScaleAndCheckPalindrome(scales)[0]);
    }

    public static String[] reverseScaleAndCheckPalindrome(String[][] scales) {
        // Write code here
        Map<String, String> notes = new HashMap<>();
        notes.put("do", "1");
        notes.put("re", "2");
        notes.put("mi", "3");
        notes.put("fa", "4");
        notes.put("sol", "5");
        notes.put("la", "6");
        notes.put("si", "7");

        StringBuilder inputScale = new StringBuilder();
        for(String[] s : scales) {
            for(String singleNote : s) {
                inputScale.append(notes.get(singleNote.replace("'", "").toLowerCase()));
            }
        }

        String original = inputScale.toString();
        String reversed = inputScale.reverse().toString();
        if(original.equals(reversed)) {
            return new String[]{"Palindrome"};
        } else {
            return new String[]{"Not a palindrome"};
        }
    }
}
