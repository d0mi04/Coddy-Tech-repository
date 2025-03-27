package org.example.Coding_Problems;

public class Example_22 {
    public static void main(String[] args) {
        System.out.printf("%d", dogYears(2));
    }

    public static int dogYears(int a1) {
        // Write code here
        int dog = 0;
        for(int i = 1; i <= a1; i++) {
            if(i == 1) {
                dog += 15;
            } else if (i == 2) {
                dog += 9;
            } else if (i >= 3 && i <= 6) {
                dog += 4;
            } else {
                dog += 5;
            }
        }
        return dog;
    }
}
