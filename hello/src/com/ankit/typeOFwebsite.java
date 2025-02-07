package com.ankit;

import java.util.Scanner;

public class typeOFwebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your website name: ");
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("It is a Organisational Website");
        }

        else if(website.endsWith(".in")){
            System.out.println("It is a Indian Website");
        }

        else if(website.endsWith(".com")){
            System.out.println("It is a Commercial Website");
        }
    }
}
