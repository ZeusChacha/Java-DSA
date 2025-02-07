package com.ankit;

import java.util.Scanner;

public class multiplicationTABLE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Taking input from the user: ");

        int a = sc.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}
