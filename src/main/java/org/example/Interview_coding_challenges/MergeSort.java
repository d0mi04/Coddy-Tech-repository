package org.example.Interview_coding_challenges;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 3, 4};
        int[] a2 = new int[]{2, 3, 4};

        System.out.println(Arrays.toString(mergeSort(a1, a2)));
    }

    public static int[] mergeSort(int[] a1, int[] a2) {
        // Write code here
        int[] result = new int[a1.length + a2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a1.length && j <a2.length) {
            if(a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }

        while(i < a1.length) result[k++] = a1[i++];
        while(j < a2.length) result[k++] = a2[j++];

        return result;
    }
}
