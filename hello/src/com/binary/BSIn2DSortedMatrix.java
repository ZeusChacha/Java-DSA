package com.binary;

import java.lang.annotation.Target;
import java.util.Arrays;

//for fully sorted matrix and doing it by using binary search
public class BSIn2DSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }

    //search in the row provided between the column provided
    //basically it is searching in 2d matrix using binary search
    static int[] binarySearch(int[][] arr, int r, int cStart, int cEnd, int target){

        while(cStart <= cEnd){

            int mid = cStart + (cEnd - cStart)/2;

            if(arr[r][mid] == target){
                return new int[]{r,mid};
            }
            if(arr[r][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            return binarySearch(arr, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        //run the loop till 2 rows are remaining

        while(rStart < (rEnd - 1)){

            int mid = rStart + (rEnd - rStart)/2;

            if(arr[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            else if (arr[mid][cMid] < target) {
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }

        //now we have 2 rows
        //check weather the target is in col of two rows

        if (arr[rStart][cMid] == target){
             return new int[]{rStart, cMid};
        }
        if (arr[rStart+1][cMid] == target){
            return new int[]{rStart +1, cMid};
        }
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, rStart, 0, cMid-1, target);
        }
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols-1]) {
            return binarySearch(arr, rStart, cMid+1, cols-1, target);
        }
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, rStart+1, 0, cMid-1, target);
        }
        else {
            return binarySearch(arr, rStart+1, cMid+1, cols-1, target);
        }
    }
}
