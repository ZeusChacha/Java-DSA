package com.Recursion;

public class digitSumAndProd {
    public static void main(String[] args) {
        System.out.println("sum of all digits: " + sum(13456));
        System.out.println("product of all digits: " + prod(13456));
    }
    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n/10);
    }
    static int prod(int n){
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * prod(n/10);
    }
}
