package org.example.Challenges.Dentists_Dilemma;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String services = scanner.nextLine();
        String uses = scanner.nextLine();

        int[] serviceCodes = rearange(services);
        int[] serviceUses = rearange(uses);

        System.out.printf("%.1f", calculateBill(serviceCodes, serviceUses));
        scanner.close();
    }

    public static int[] rearange(String line) {
        String[] split = line.replaceAll("[\\[\\]]", "").split(", ");
        int[] result = new int[split.length];
        for(int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }
        return result;
    }

    public static float calculateBill(int[] serviceCodes, int[] serviceUses) {
        // Write code here
        float totalBill = 0;
        Map<Integer, Integer> allServices = new HashMap<Integer, Integer>();
        allServices.put(1, 50);
        allServices.put(2, 150);
        allServices.put(3, 100);
        allServices.put(4, 200);

        // calculating all cost:
        for(int i = 0; i < serviceCodes.length; i++) {
            totalBill += allServices.get(serviceCodes[i]) * serviceUses[i];
        }

        // applying discounts:
        for(int i = 0; i < serviceCodes.length; i++) {
            if(serviceUses[i] > 3 ) {
                float discount = allServices.get(serviceCodes[i])*0.1f;
                totalBill -= discount * serviceUses[i];
            }
        }

        if(Arrays.stream(serviceCodes).anyMatch(x -> x == 1) && Arrays.stream(serviceCodes).anyMatch(x -> x == 2)) {
            float allBillDiscount = 0.05f;
            totalBill *= (1.0f - allBillDiscount);
        }

        return totalBill;
    }
}
