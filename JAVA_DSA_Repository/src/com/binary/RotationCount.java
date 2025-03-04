package com.binary;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(search(arr,target));
    }

    //it searches the target element and return its indices that at which position the target element is present
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, 0,pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    //use this for finding pivot for non duplicates elements present in the array
    //it basically just finds the pivot point in a given array
    //and the above object/function search and binary search helps the program to find the targeted index element in the given array
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
}
