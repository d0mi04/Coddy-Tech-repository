package org.example.Coding_Problems;

public class Example_15 {
    public static void main(String[] args) {
        System.out.printf("%d", factorial(7));
    }

    public static int factorial(int a1) {
        // Write code here
        int result = 1;
        for(int i = 1; i <= a1; i++) {
            result *= i;
        }
        return  result;
    }
}
