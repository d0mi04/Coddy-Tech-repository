package org.example.Challenges.Garden_Note_Formatter;

import java.util.Scanner;

public class Garden_Note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String plantName = scanner.nextLine();
        String[] activities = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");

        System.out.printf("%s", formatGardenNotes(date, plantName, activities));
    }

    public static String formatGardenNotes(String date, String plantName, String[] activities) {
        // Write code here
        StringBuilder message = new StringBuilder();
        message.append(date).append(":\n");
        for(String s : activities) {
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1);

            message.append("- ").append(s).append(" ").append(plantName).append(".\n");
        }
        return message.toString();
    }
}
