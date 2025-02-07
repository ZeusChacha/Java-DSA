package com.sortingTypes;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
        boolean swapped;

        //run the steps n-1 time

        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            //for each step the max index will come at the last respective index

            for (int j = 1; j < arr.length - 1; j++) {

                //swap if the item is smaller than the previous item

                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]  = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if u did not swap for particular value of i, it means the array is sorted, Hence stop the program
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
