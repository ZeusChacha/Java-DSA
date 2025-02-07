package com.Recursion;

public class countSteps {
    public static void main(String[] args) {
        //System.out.println(helper(12,0));{if u are writting this no need to make steps class seperately}
        System.out.println(steps(12));
    }
    static int steps(int num){
        return helper(num, 0);
    }
    static int helper(int num, int steps){
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }
        return helper(num - 1, steps + 1);
    }
}
