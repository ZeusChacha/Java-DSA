package com.ankit;
import java.util.Scanner;

public class add2numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the seacond number");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("Addition of the given number is: " + sum);

    }
}
