package org.example.Challenges.DailyChallenges.Hillside_house_organisation;

import java.util.*;

public class Organiser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] houseNames = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");
        String[] sizes = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");
        int[] houseSizes = new int[sizes.length];
        for(int i = 0; i < sizes.length; i++) {
            houseSizes[i] = Integer.parseInt(sizes[i]);
        }

        String[] organisedHouses = organizeHillsideHouses(houseNames, houseSizes);
        for(String s : organisedHouses) {
            System.out.printf("%s, ", s);
        }
    }

    public static String[] organizeHillsideHouses(String[] houseNames, int[] houseSizes) {
        // Write code here
        Map<String, Integer> houses = new HashMap<>();
        for(int i = 0; i < houseNames.length; i++) {
            houses.put(houseNames[i], houseSizes[i]);
        }

        List<Map.Entry<String, Integer>> top = new ArrayList<>();
        List<Map.Entry<String, Integer>> bottom = new ArrayList<>();
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : houses.entrySet()) {
            if(isHouseTop(entry.getKey())) {
                top.add(entry);
            } else {
                bottom.add(entry);
            }
        }

        top.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        bottom.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        sorted.addAll(top);
        sorted.addAll(bottom);

        String[] result = new String[sorted.size()];
        for(int i = 0; i < sorted.size(); i++) {
            result[i] = sorted.get(i).getKey();
        }
        return result;
    }

    public static boolean isHouseTop(String house) {
        return "AEIOU".indexOf(house.charAt(0)) != -1;
    }
}
