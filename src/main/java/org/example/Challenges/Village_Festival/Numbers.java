package org.example.Challenges.Village_Festival;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");
        int[] numbers = new int[nums.length];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        int k = scanner.nextInt();

        int[] result = villageFestivalNumbers(numbers, k);
        for(int i : result) {
            System.out.printf("%d,", i);
        }
    }

    public static int[] villageFestivalNumbers(int[] numbers, int k) {
        // Write code here
        List<Integer> specialNumbers = new ArrayList<>();
        int avarage = 0;
        for(int i : numbers) {
            avarage += i;
        }
        avarage /= numbers.length;

        for(int i : numbers) {
            if(i > avarage && i % k == 0) {
                specialNumbers.add(i);
            }
        }

        return specialNumbers.stream().mapToInt(i -> i).toArray();
    }
}
