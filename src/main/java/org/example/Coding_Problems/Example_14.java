package org.example.Coding_Problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Example_14 {
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<Integer> fibList = fibbonaci(N);
        for(Integer i : fibList) {
            System.out.printf("%d ", i);
        }
        scan.close();
    }

    public static List<Integer> fibbonaci(int N) {
        List<Integer> fibList = new ArrayList<>();
        int a = 1;
        int b = 1;

        while(a <= N) {
            fibList.add(a);
            int next = a + b;
            a = b;
            b = next;
        }

        return fibList;
    }
}