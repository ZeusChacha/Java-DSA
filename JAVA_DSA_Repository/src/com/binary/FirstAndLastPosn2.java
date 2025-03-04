package com.binary;

import java.util.Arrays;

public class FirstAndLastPosn2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 4, 5};
        int target = 3;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
        static int[] searchRange(int[] nums, int target) {
            int []arr={-1,-1};
            arr[0]=search(nums,target,true);
            if(arr[0]!=-1)
            {
                arr[1]=search(nums,target,false);
            }
            return arr;


        }
        public static int search(int []nums,int target, boolean index)
        {
            int ans=-1;
            int start=0;
            int end=nums.length-1;

            while(start<=end)
            {
                int mid=(start+end)/2;
                if(target>nums[mid])
                {
                    start=mid+1;

                }
                else if(target<nums[mid])
                {
                    end=mid-1;
                }
                else
                {
                    ans=mid;
                    if(index)
                    {
                        end=mid-1;
                    }
                    else
                    {
                        start=mid+1;
                    }
                }
            }
            return ans;
        }


}
