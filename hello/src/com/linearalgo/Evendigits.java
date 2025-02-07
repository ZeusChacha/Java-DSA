package com.linearalgo;

public class Evendigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 234567};
        System.out.println(findNumbers(nums));
        System.out.println(digits(909080));
        System.out.println(digits2(9090));
    }

    //function to check weather a number contains even digits or not

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
    }

    //count numbers of digits in a number method 2

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    //count numbers of digits in a number method 1

    static int digits(int num){
        if (num<0){
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}
