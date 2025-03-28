package org.example.Coding_Problems;

import java.util.Scanner;

public class Example_26 {
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for(int i = 0; i < count; i++) {
            int number = scan.nextInt();
            if(isPalindrome(number) || isDivisible(number)) {
                System.out.printf("YES ");
            } else {
                System.out.printf("NO ");
            }
        }
        scan.close();
    }

    public static boolean isDivisible(int number) {
        char[] dividers = String.valueOf(number).toCharArray();
        for(Character c : dividers) {
            if(number % (c-'0') != 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isPalindrome(int number) {
        String num = String.valueOf(number);
        String reversed = new StringBuilder(num).reverse().toString();
        return num.equals(reversed);
    }
}
