package org.example.Coding_Problems;

public class Example_16 {
    public static void main(String[] args) {
        System.out.printf("%d", numberOfDigits(100));
    }

    public static int numberOfDigits(int a1) {
        // Write code here
        return String.valueOf(a1).length();
    }
}