package com.binary;

//OABS it not need to be sorted

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 0, 33, 23, 48};
        int target = 23;
        int ans = oasb(arr, target);
        System.out.println(ans);
    }
    static int oasb(int[] arr, int target) {

        int start = 0;

        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;

    }

}

