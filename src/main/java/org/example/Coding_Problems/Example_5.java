package org.example.Coding_Problems;
import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) { 
        // Write code here

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.printf("%d", findMiddleNumber(number));

        scanner.close();
    }

    public static int findMiddleNumber(int number) {
        String snum = Integer.toString(number);

        char middleNum = snum.charAt(snum.length()/2);

        return middleNum - '0';
    }
}
