package org.example.Coding_Problems;

import java.util.Scanner;

public class Example_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();

        System.out.printf("%s", calculations(a1, a2, a3));
        scan.close();
    }

    public static String calculations(int a1, int a2, int a3) {
        String s = "";
        StringBuilder result = new StringBuilder();
        // if sum:
        if(a1 + a2 == a3) {
            return result.append(a1).append("+").append(a2).append("=").append(a3).toString();
        } else if (a1 - a2 == a3) {
            return result.append(a1).append("-").append(a2).append("=").append(a3).toString();
        } else if (a1 * a2 == a3) {
            return result.append(a1).append("*").append(a2).append("=").append(a3).toString();
        } else if (a1 / a2 == a3) {
            return result.append(a1).append("/").append(a2).append("=").append(a3).toString();
        } return s;
    }
}
