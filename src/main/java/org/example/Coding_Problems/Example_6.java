package org.example.Coding_Problems;
import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        // Write code here

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(canBeATriangle(a, b, c)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

        scan.close();

    }

    public static boolean canBeATriangle(int a, int b, int c) {
        if(a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }
}
