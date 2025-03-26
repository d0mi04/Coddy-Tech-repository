package org.example.Coding_Problems;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        // Write code here

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        System.out.printf("%d", calculateMonthDays(month));

        scanner.close();
    }

    public static int calculateMonthDays(int month) {
        Map<Integer, Integer> months = new LinkedHashMap<Integer, Integer>();
        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);

        return months.get(month);
    }
}
