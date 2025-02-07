package com.sortingTypes;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            //find the max item in the remaining array and swap with correct item

            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr [first];
        arr [first] = arr [second];
        arr [second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        //we can write 0 instead of start because we have initialised the value of start above in selection()
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
