package com.ankit;

import java.util.Scanner;

public class leapYEAR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year: ");
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("Its a leap year");
        }
        else if(year % 100 == 0){
            System.out.println("Not a leap year");
        }
        else if(year % 4 == 0){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
