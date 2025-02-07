package com.ankit;

import java.util.Scanner;

public class leapYEAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Year: ");
        int year = sc.nextInt();
        boolean flag = false;

        if(year % 400 == 0){
            flag = true;
        }
        else if(year %100 == 0){
            flag = false;
        }
        else if(year % 4 == 0){
            flag = true;
        }
        else{
            flag = false;
        }

        if(flag){
            System.out.println("Year "+ year +" is a Leap Year");
        }
        else{
            System.out.println("Year "+ year +" is not a Leap Year");
        }
    }
}
