package org.example.Challenges.Jungle_Mystery_Decoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] messageTab = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");
        int key = scanner.nextInt();

        int[] message = new int[messageTab.length];
        for(int i = 0; i < message.length; i++) {
            message[i] = Integer.parseInt(messageTab[i]);
        }

        System.out.printf("%s", decodeJungleMessage(message, key));
    }

    public static String decodeJungleMessage(int[] message, int key) {
        // Write code here
        List<Integer> selected = new ArrayList<>();
        int result;
        for(int i = 0; i < message.length; i++) {
            if(i % key == 0) {
                if(message[i] % 2 == 0) { // even
                    result = message[i] & key;
                } else {
                    result = message[i] | key;
                }

                if(result % 3 == 0) {
                    result--;
                }

                if(result % 5 == 0) {
                    result++;
                }

                selected.add(result);
            }
        }
        StringBuilder decodedMessage = new StringBuilder();
        for(int i : selected) {
            decodedMessage.append((char)i);
        }
        return decodedMessage.toString();
    }
}
