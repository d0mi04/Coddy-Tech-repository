package org.example.Challenges.Palindrome_and_Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class InsectName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String insectName = scanner.nextLine();
        String[] insectCollection = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");
        boolean[] results = insectIdentifier(insectName, insectCollection);
        for(boolean b : results) {
            System.out.print(b + ",");
        }
    }

    public static boolean[] insectIdentifier(String insectName, String[] insectCollection) {
        // Write code here
        boolean[] result = new boolean[2];
        StringBuilder pom = new StringBuilder(insectName);
        result[0] = pom.reverse().toString().equals(insectName);

        char[] sortInsectName = insectName.toCharArray();
        Arrays.sort(sortInsectName);
        String sort = new String(sortInsectName);

        boolean isAnagram = true;
        for(String s : insectCollection) {
            char[] sortedChars = s.toCharArray();
            Arrays.sort(sortedChars);
            String sortedS = new String(sortedChars);

            if(!sortedS.equals(sort)) {
                isAnagram = false;
                break;
            }
        }
        result[1] = isAnagram;

        return result;
    }
}
