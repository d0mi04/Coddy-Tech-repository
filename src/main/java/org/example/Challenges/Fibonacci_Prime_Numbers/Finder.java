package org.example.Challenges.Fibonacci_Prime_Numbers;

import java.util.Arrays;

public class Finder {
    public static void main(String[] args) {
        System.out.printf("%s", Arrays.toString(findFibonacciPrimes(20)));
    }

    public static int[] findFibonacciPrimes(int n) {
        // Write code here
        int[] result = new int[n];
        int fib1 = 0;
        int fib2 = 1;
        for(int i = 0; i < n ; i++) {
            int fib3 = fib1 + fib2;
            if(!isPrime(fib3)) {
                i--;
            } else {
                result[i] = fib3;
            }

            fib1 = fib2;
            fib2 = fib3;
        }
        return result;
    }

    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
