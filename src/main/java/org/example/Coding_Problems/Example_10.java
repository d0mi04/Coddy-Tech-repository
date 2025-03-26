package org.example.Coding_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        int [] numbers = new int[3];
        numbers[0] = scan.nextInt(); // A
        numbers[1] = scan.nextInt(); // B
        numbers[2] = scan.nextInt(); // C

        int [] swappedTab = bubbleSort(numbers);
        for(int i = 0; i < swappedTab.length; i++) {
            System.out.printf("%d ", swappedTab[i]);
        }
    }

    public static int[] bubbleSort(int[] numbers) {
        int[] sorted = Arrays.copyOf(numbers, numbers.length);

        // sorting algorithm:
        for(int i = 0; i < numbers.length; i++) {
            boolean swapped = false;
            for(int j = 0; j < numbers.length - 1 - i; j++) {
                if(sorted[j] > sorted[j + 1]) {
                    // swapping elements
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        return sorted;
    }
}
