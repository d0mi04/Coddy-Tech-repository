package org.example.Coding_Problems;

import java.util.Scanner;

public class Example_32 {
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[] result = divisors(a, b);
        System.out.printf("%d %d", result[0], result[1]);
    }

    public static int[] divisors(int a, int b) {
        int[] result = new int[]{0, 0};
        for(int num = a; num <= b; num++) {
            int div = getNumDivisors(num);
            if(div > result[1]) {
                result[0] = num;
                result[1] = div;
            } else if(div == result[1] && num < result[0]) {
                result[0] = num;
            }
        }
        return result;
    }

    public static int getNumDivisors(int num) {
        int count = 0; // every number has: 1 and itself
        for(int i = 1; i * i <= num; i++) {
            if(num % i == 0) {
                count++;
                if(i != num / i) {
                    count++;
                }
            }
        }
        return count;
    }
}
