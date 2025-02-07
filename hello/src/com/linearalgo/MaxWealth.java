package com.linearalgo;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},
                {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;

        /*for (int[] ints : accounts)
            //when u start a new row take a new sum for that row

            int sum = 0;

            for (int anInt : ints) {
                sum += anInt;
            }

        */
            for (int person = 0; person < accounts.length; person++) {

                int sum = 0;

                for (int account = 0; account < accounts[person].length; account++)

                    sum = sum + accounts[person][account];

                if (sum > ans) {
                    ans = sum;
                }
            }
            return ans;
        }
}
