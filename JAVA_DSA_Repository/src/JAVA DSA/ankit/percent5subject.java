package com.ankit;
import java.util.Scanner;
public class percent5subject {
    public static void main(String[] args) {
        System.out.println("Enter your Subject Marks");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Physics Marks: ");
        float Physics = sc.nextFloat();

        System.out.print("Enter your Chemistry Marks: ");
        float Chemistry = sc.nextFloat();

        System.out.print("Enter your Maths Marks: ");
        float Maths = sc.nextFloat();

        System.out.print("Enter your Computer Science Marks: ");
        float Computer_Science = sc.nextFloat();

        System.out.print("Enter your English Marks: ");
        float English = sc.nextFloat();

        float percentage = ((Physics+Chemistry+Maths+Computer_Science+English)/500.0f)*100;
        System.out.print("Your Toatal Percentage: " + percentage );
    }
}
