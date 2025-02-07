package com.ankit;

import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of the Circle: ");

        double r = sc.nextDouble();
        area = Math.PI * r * r;

        System.out.println("Area of the Circle is: " + area);
    }
}
