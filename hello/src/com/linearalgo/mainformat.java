package com.linearalgo;

public class mainformat {
    public static void main(String[] args) {
        int [] nums = {23, 45, 1, 2, 19, -2, -32, -11};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search the target and return true or false if its present in the given arr
    // int ke aage boolean laga dena

   /* static boolean linearSearch(int [] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for(int element : arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }
*/

    //search the target and return the element if its present in the given arr

    /* static int linearSearch(int [] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if (element  == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;// it just returns the max value an integer can hold u could have just returned anything
    }
*/

    //search in the array and return index if item is found

    static int linearSearch(int [] arr, int target){

        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {

            int element = arr[index];

            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
