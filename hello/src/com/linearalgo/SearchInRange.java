package com.linearalgo;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {18, 12, -7, 3, 14, 28};
        int target = 28;
        System.out.println(linearSearch(arr, target, 1, 4));
        //start aur end define kar dene se uske bich me hi answer dhundega wo
        // uss range ke bahar search karoge toh -1 return kardega
    }
    static int linearSearch(int [] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int element = arr[index];

            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
