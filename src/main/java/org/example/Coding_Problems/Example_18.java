package org.example.Coding_Problems;

public class Example_18 {
    public static void main(String[] args) {
        System.out.printf("%d", sum(0, 1, 10));
    }
    public static int sum(int a1, int a2, int a3) {
        // Write code here
        int largest = Math.max(a1, Math.max(a2, a3));
        if(largest == a1) {
            a1 = 0;
        } else if (largest == a2) {
            a2 = 0;
        } else {
            a3 = 0;
        }

        return a1 + a2 + a3 + (int)Math.pow(largest, 2);
    }
}
