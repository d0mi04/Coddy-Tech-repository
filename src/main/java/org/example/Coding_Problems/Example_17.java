package org.example.Coding_Problems;

public class Example_17 {
    public static void main(String[] args) {
        System.out.printf("%d", LCM(2, 3));
    }

    public static int LCM (int a1, int a2) {
        return (a1 * a2) / GCD(a1, a2);
    }

    public static int GCD (int a1, int a2) {
        while(a2 != 0) {
            int temp = a2;
            a2 = a1 % a2;
            a1 = temp;
        }
        return a1;
    }
}