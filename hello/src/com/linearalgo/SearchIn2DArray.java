package com.linearalgo;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {16, 4, 9},
                {10, 13, 3, 9},
                {78, 39, 49, 56},
                {18, 12}
        };
        int target = 12;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

         System.out.println(max(arr));
    }

    //for finding the index of the target element in the given 2D array
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};

    }

    //for finding the max value in a 2D array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (arr[row][col] > max) {
                     max = arr[row][col];
                }
        return max;
    }
}
