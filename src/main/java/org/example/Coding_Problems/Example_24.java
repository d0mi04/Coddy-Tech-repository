package org.example.Coding_Problems;

public class Example_24 {
    final static int GOAL = 10000;
    public static void main (String[] args) {
        System.out.printf("%d", steps(26, 22));
    }

    public static int steps(int a1, int a2) {
        // Write code here
        return GOAL - (a1 * 60 * 2 + a2 * 60 * 4);
    }
}
