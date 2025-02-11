package com.sortingTypes;

import java.util.Arrays;
//it finds the missing element in the array by cyclic sort

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1, 3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        //yaha index = index value hai toh jaha bhi index != value hai wo ans ho jayega sorting ke baad

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return new int[]{index};
            }
        }
        return new int[]{-1}; //kuch bhi return kar sakte ho yaha
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
