package com.ankit;
import java.io.*;
import java.util.Scanner;

public class starPattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter any number: ");
            int rows = sc.nextInt(); // Input number of rows

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


