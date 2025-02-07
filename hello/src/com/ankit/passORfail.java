package com.ankit;

import java.util.Scanner;

public class passORfail {
    public static void main(String[] args) {
        Byte m1,m2,m3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in first subject: ");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Seacond subject: ");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Third subject: ");
        m3 = sc.nextByte();

        float avg = ((m1+m2+m3)/3.0f);
        System.out.println("Your overall percentage is: " + avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation you have been promoted");
        }
        else{
            System.out.println("Sorry,You have not been promoted!, Please try again");
        }
    }
}
