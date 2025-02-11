package com.sortingTypes;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNo {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(find(arr));
    }
    static List<Integer> find(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    ans.add(index + 1); // USE THIS FOR MISSING ELEMENTS
                 //   ans.add(nums[index]); USE THIS TO FIND THE REPEATED ELEMENTS IN ARRAY
                }
            }
            return ans;
        }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

         /*
        int i = 0;
        while (i < arr.length) {
            int position = arr[i] - 1;
            if (arr[i] != arr[position]) {
                int temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                list.add(i + 1);
            }
        }

        return list;
    }
    */
}
