package org.example.Interview_coding_challenges;

public class AlmostPalindrome {
    public static void main(String[] args) {
        System.out.printf("%s", isAlmostPalindrome("vxxxxxxxxaxx"));
    }

    public static boolean isAlmostPalindrome(String s) {
        // Write code here
        StringBuilder rev = new StringBuilder(s).reverse();
        int diffCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != rev.toString().charAt(i)) {
                diffCount++;
            }
            if(diffCount > 2) {
                return false;
            }
        }
        return true;
    }
}
