package org.example.Coding_Problems;

import java.util.Scanner;

public class Example_29 {
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        String line = "";
        int height = 0;
        int width = 0;
        while(true) {
            line = scan.nextLine();
            if(line.contains("3")) {
                height++;
                break;
            }
            height++;
        }
        for(Character c : line.toCharArray()) {
            if(Character.isDigit(c)) {
                width++;
            }
        }
        System.out.printf("%d %d", height, width);
        scan.close();
    }
}
