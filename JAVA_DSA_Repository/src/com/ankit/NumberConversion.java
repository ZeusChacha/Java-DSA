package com.ankit;

public class NumberConversion {
    public static void BinToDeci(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }
    public static void DeciToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {
        BinToDeci(101);
        DeciToBin(7);
    }
}
