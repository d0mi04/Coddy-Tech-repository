package org.example.Coding_Problems;
import java.util.Scanner;
public class Example_8 {
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        System.out.printf("%d", sumToN(N));

        scan.close();
    }

    public static int sumToN(int N) {
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += i;
        }

        return sum;
    }
}
