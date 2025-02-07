package com.binary;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,8,6,3,2};
        System.out.println(peakInMountainArray(arr));
    }

    static int peakInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
