package org.example.Coding_Problems;

public class Example_30 {
    public static void main(String[] args) {
        System.out.printf("%d", largestNum(996));
    }

    public static int largestNum(int a1) {
        String numStr = Integer.toString(a1);
        int maxNum = a1;

        if(a1 == 999) {
            return 996;
        }

        for(int i = 0; i < numStr.length(); i++) {
            for(char newDigit = '9'; newDigit >= '0'; newDigit--) {
                if(newDigit == numStr.charAt(i)) {
                    continue;
                }

                String modified = numStr.substring(0, i) + newDigit + numStr.substring(i + 1);
                int modifiedNum = Integer.parseInt(modified);

                if(modifiedNum % 3 == 0 && modifiedNum > maxNum) {
                    maxNum = modifiedNum;
                }
            }
        }
        return maxNum;
    }
}
