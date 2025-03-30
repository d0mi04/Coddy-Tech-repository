package org.example.Challenges.Harbor_Signal_Decoder;

public class Signal_Decoder {
    public static void main(String[] args) {
        System.out.printf("%s", harborSignalDecoder("111001000011110000111"));
    }

    public static String harborSignalDecoder(String signalPattern) {
        // Write code here
        StringBuilder message = new StringBuilder();
        int letterCount = 0;
        boolean dot = false;

        for(int i = 0; i < signalPattern.length(); i++) {
            if(signalPattern.toCharArray()[i] == '1') {
                letterCount++;
                dot = false;
            } else if (signalPattern.toCharArray()[i] == '0' && !dot) {
                if(letterCount > 0) {
                    message.append(getLetterFromNumber(letterCount));
                    letterCount = 0;
                }
                message.append(".");
                dot = true;
            }
        }
        if(letterCount > 0) {
            message.append(getLetterFromNumber(letterCount));
        }
        return message.toString();
    }

    public static String getLetterFromNumber(int number) {
        if(number > 0 && number <= 26) {
            return String.valueOf((char) ('A' + number - 1));
        } else {
            return "Z";
        }
    }
}
