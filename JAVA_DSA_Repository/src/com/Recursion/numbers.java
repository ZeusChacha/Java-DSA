package com.Recursion;

public class numbers {
    public static void main(String[] args) {
        System.out.println("this will print N to 1");
        fun(5);
        System.out.println("this will print 1 to N");
        funRev(5);
        System.out.println("this is also similar to fun but different approach");
        funWay2(5);
    }

    static void fun(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        if (n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void funWay2(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funWay2(--n);
    }
}
