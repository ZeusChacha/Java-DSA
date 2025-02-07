package com.binary;

public class RCountWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,1,0};
        int target = 0;
        System.out.println(search1(arr,target));
    }
    static int search1(int[] arr, int target){
        int pivot = findPivotWithDuplicates(arr);
        if(pivot == -1){
            return binarySearch1(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if (target > arr[0]) {
            return binarySearch1(arr, target, 0, pivot-1);
        }
        return binarySearch1(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearch1(int[] arr, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                end = mid -1;
            }
            else if(arr[mid + 1] > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
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
