package com.pattern;

public class BigTrianglePatterns {
    public static void main(String[] args) {
        upPyramid1Way1(4);
        upPyramid1Way2(4);
        downPyramid2Way1(4);
        downPyramid2Way2(4);
        downPyramid2Way3(4);
        upV(4);
        downV(4);
    }
    static void upPyramid1Way1(int n){
        System.out.println(" it is made with the combination of 3 triangles pyramid 1a");
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            for (int l = 1; l < i; l++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void upPyramid1Way2(int n){
        System.out.println(" it is made with the combination of 3 triangles pyramid 1b");
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void downPyramid2Way1(int n){
        System.out.println(" it is made with the combination of 3 triangles pyramid 2a");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = n; k > i; k--) {
                System.out.print(" *");
            }
            for (int l = n-1; l > i; l--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void downPyramid2Way2(int n){
        System.out.println(" it is made with the combination of 3 triangles pyramid 2b");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = n+2; k >= (i * 2); k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void downPyramid2Way3(int n){
        System.out.println(" it is made with the combination of 3 triangles pyramid 2c");
        for (int i = 0; i > n; i--) {
            System.out.print(" ");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void upV(int n){
        System.out.println("made by using the the code of down pyramid code 2c diagram 3");
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                if (k > 1 && k < (i*2)-1) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
    static void downV(int n){
        System.out.println("made by using the the code of UP pyramid diagram 4");
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                if (k > 1 && k < (i * 2) - 1) {
                    System.out.print("  ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
