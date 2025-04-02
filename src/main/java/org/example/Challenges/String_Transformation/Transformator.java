package org.example.Challenges.String_Transformation;

import java.util.Scanner;

public class Transformator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        String modifier = scanner.nextLine();

        System.out.printf("%s", transformStrings(original, modifier));
    }

    public static String transformStrings(String original, String modifier) {
        // Write code here
        StringBuilder modifierRev = new StringBuilder(modifier);
        return modifierRev.reverse().append(original).toString();
    }
}
