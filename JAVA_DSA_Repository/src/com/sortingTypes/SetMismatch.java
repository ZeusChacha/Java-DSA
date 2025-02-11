package com.sortingTypes;
import java.util.Arrays;

//IT FINDS NUMBER THAT OCCUR TWICE AND THE NUMBER THAT IS MISSING AND RETURN THEM IN FORM OF ARRAY

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        //answer will be [2,3] where 2 is the repeated number and 3 is the missing number
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
         }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
