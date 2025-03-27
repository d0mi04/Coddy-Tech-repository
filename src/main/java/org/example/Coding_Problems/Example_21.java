package org.example.Coding_Problems;

public class Example_21 {
    public static void main(String[] args) {
        System.out.printf("%d", gifts(22, 6, 5));
    }

    public static int gifts(int a1, int a2, int a3) {
        // Write code here
        return a1 / a3 - a1 / a2;
    }
}
