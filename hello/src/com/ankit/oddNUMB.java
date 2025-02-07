package com.ankit;

import java.util.Scanner;

public class oddNUMB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit: ");

        int a = sc.nextInt();

        System.out.println("ODD Numbers: ");

        for (int i = 0; i <= a ; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}
