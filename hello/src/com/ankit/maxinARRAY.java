package com.ankit;

public class maxinARRAY {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int max = 0;
        for (int e: arr){
            if (e > max) {
                max = e;
            }
        }
        System.out.println("The value of the maximum element in the array is: " + max);
    }
}
