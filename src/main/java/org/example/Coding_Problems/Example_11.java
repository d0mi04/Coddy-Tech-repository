package org.example.Coding_Problems;

import java.util.Scanner;

public class Example_11 {
    static final double PI = 3.142;
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();

        System.out.printf("%.3f %.3f", calculatePerimeter(radius), calculateArea(radius));
        scan.close();
    }

    public static double calculatePerimeter(int radius) {
        return 2 * PI * radius;
    }

    public static double calculateArea(int radius) {
        return PI * Math.pow(radius, 2);
    }
}
