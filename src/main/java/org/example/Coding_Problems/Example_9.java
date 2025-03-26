package org.example.Coding_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> Ns = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            Ns.add(scan.nextInt());
        }

        System.out.printf("%d", sumOfNumbers(Ns));

        scan.close();
    }

    public static int sumOfNumbers(List<Integer> Ns) {
        int sum = 0;
        for(Integer n : Ns) {
            sum += n;
        }
        return sum;
    }
}
