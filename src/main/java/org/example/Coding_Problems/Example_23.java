package org.example.Coding_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Example_23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int anagramCount = 0;
//        Map<Integer, Integer> list = new HashMap<>();
        for(int i = 0; i < count; i++) {
//            list.put(scan.nextInt(), scan.nextInt());
            if(canBeAnagram(scan.nextInt(), scan.nextInt())) {
                anagramCount++;
            }
        }
        System.out.printf("%d", anagramCount);

        scan.close();
    }

    public static boolean canBeAnagram(int a, int b) {
        char[] stringA = String.valueOf(a).toCharArray();
        char[] stringB = String.valueOf(b).toCharArray();

        if(stringA.length != stringB.length) {
            return false;
        }

        Arrays.sort(stringA);
        Arrays.sort(stringB);

        return Arrays.equals(stringA, stringB);
    }
}
