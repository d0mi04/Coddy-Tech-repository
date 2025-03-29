package org.example.Coding_Problems;
import java.util.Scanner;

public class Example_7 { 
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        System.out.printf("%d %d %d %d", sum(A, B), difference(A, B), product(A, B), quotient(A, B));

        scan.close();
    }

    public static int sum(int A, int B) {
        return A + B;
    }

    public static int difference(int A, int B) {
        return A - B;
    }

    public static int product(int A, int B) {
        return A * B;
    }

    public static int quotient(int A, int B) {
        return A / B;
    }
}
