package org.example.Coding_Problems;

public class Example_28 {
    public static void main(String[] args) {
        System.out.printf("%d", digit(17));
    }

    public static int digit(int a1) {
        // Write code here
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= a1; i++) {
            if(result.toString().length() >= a1) {
                return result.toString().charAt(a1 - 1) - '0'; // position is a1 - 1, because index start from 0
            }
            for(int j = 1; j <= i; j++) {
                result.append(j);
            }
        }
        return result.toString().charAt(a1) - '0';
    }
}
