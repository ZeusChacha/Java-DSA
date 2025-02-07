package com.sortingTypes;

import java.util.Arrays;

public class FirstMissingPositive {
    //smallest positive number missing

    public static void main(String[] args) {
        int[] arr = {-1, 1, 3, 4};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){

        int i = 0;

        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[correct] != arr[i]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr [index] != index + 1) {
                return new int[]{(index + 1)};
            }
        }
        return new int[]{arr.length+1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
