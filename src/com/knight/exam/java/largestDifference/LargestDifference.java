package com.knight.exam.java.largestDifference;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class LargestDifference {

    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{-2, 3, 4, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }


    static int largestDifferenceOfEvens(int[ ] a){
            int smallestEven = Integer.MAX_VALUE;
            int largestEven = Integer.MIN_VALUE;
            int evenCount = 0;
    
            for (int j : a) {
                if (j % 2 == 0) {
                    evenCount++;
                    if (j > largestEven) {
                        largestEven = j;
                    }
                    if (j < smallestEven) {
                        smallestEven = j;
                    }
                }
            }
            if (evenCount < 2){
                return -1;
            }
            return largestEven - smallestEven;
    }

    static int largestDifferenceOfEvens2(int[] a) {
        boolean evenFlag = false;
        int largestDiff = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        evenFlag = true;
                        int diff = a[i] > a[j] ? a[i] - a[j] : a[j] - a[i];
                        largestDiff = diff > largestDiff ? diff : largestDiff;
                    }
                }
            }
            if (!evenFlag && i == a.length - 1)
                return -1;
        }

        return largestDiff;
    }
}
