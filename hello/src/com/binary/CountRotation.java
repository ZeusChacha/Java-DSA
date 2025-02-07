package com.binary;

public class CountRotation {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findRotation(arr));
    }

    //it finds how much time a arr is rotated in finding the pivot
    //logic = no. of rotations = pivot index + 1

    static int findRotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    //use this for finding pivot for non duplicates elements present in the array
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    //use this method when there are duplicates in a given array
    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            //if elements at middle, start, end are equal then just skip the duplicates

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //NOTE: what if these elements at start and end were the pivot
                //check if start is pivot

                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start ++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end --;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
