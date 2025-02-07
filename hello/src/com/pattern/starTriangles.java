package com.pattern;

public class starTriangles {
    public static void main(String[] args) {
        triangle1(4);
        triangle2(4);
        triangle3(4);
        triangle4(4);
        triangle5(4);
        triangle6(4);
        triangle7(4);

    }
    static void triangle1(int n){
        System.out.println("this is left increasing right angle triangle 1");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //we can also use triangle 2 for pyramid by just including a space in front of *
    static void triangle2(int n){
        System.out.println("this is left decreasing right angle triangle 2");

        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void triangle3(int n){
        System.out.println("triangle 1 + triangle2 = triangle3 ");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //we can also use triangle 4 for pyramid by just including a space in front of *
    //and also combine them t2 and t4 to make a star pattern
    static void triangle4(int n){
        System.out.println("this is right increasing right angle triangle4");
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangle5(int n){
        System.out.println("this is right decreasing right angle triangle 5");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangle6(int n){
        System.out.println("triangle4 + triangle5 = triangle6");
        for (int i = 0; i <= n ; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=  i; j++) {
                System.out.print(" ");
            }
            for (int k = n-1; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //alternative code for upward pyramid that can also be made using code of t4 and the downward from t2
    static void triangle7(int n){
        System.out.println("upward isosceles triangle 7");
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > 0; j--) {

                if (j > i) {
                    System.out.print(" ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}


