package com.ankit;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println("The ASCII value of " + ch + " is: " + (int)ch);
    }
}
