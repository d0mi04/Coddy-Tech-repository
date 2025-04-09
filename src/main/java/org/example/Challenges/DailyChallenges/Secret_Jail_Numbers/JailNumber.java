package org.example.Challenges.DailyChallenges.Secret_Jail_Numbers;

import java.util.Scanner;

public class JailNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.printf("%s", isJailNumber(number));
        scanner.close();
    }

    public static String isJailNumber(int number) {
        // Write code here
        int sumOfDigits = 0; // number of digits is num.length()
        String num = String.valueOf(number);
        for(char c : num.toCharArray()) {
            sumOfDigits += c - '0';
        }
        int result = (int) Math.pow(sumOfDigits, num.length());
        if(result == number) {
            return "Jail Number: " + number + " (Sum: " + sumOfDigits + ", Digits: " + num.length() + ")";
        } else {
            return "Not a Jail Number: " + number + " (Sum: " + sumOfDigits + ", Digits: " + num.length() + ")";
        }
    }
}
