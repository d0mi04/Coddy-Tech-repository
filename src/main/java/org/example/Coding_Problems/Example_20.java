package org.example.Coding_Problems;

public class Example_20 {
    public static void main(String[] args) {
        System.out.printf("%d", apples(11));
    }

    public static int apples(int a1) {
        // Write code here
        if(a1 % 4 == 0) {
            return 0;
        } else {
            return 4 - a1 % 4;
        }
    }
}
