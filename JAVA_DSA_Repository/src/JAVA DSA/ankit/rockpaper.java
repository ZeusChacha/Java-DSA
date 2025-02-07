package com.ankit;

import java.util.Random;
import java.util.Scanner;

public class rockpaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, Enter 1 for Paper, Enter 2 for Scissor");
        int UserINPUT = sc.nextInt();
        System.out.println("user chose: " +  UserINPUT);

        Random rd = new Random();
        int ComputerINPUT = rd.nextInt(3);
        System.out.println("computer chose: " +  ComputerINPUT);

        if(UserINPUT == ComputerINPUT) {
            System.out.println("Draw");
        }
           else if(UserINPUT==0 && ComputerINPUT==2 || UserINPUT==1 && ComputerINPUT==0 || UserINPUT==2 && ComputerINPUT==1){
                System.out.println("You Win");
            }
            else {
                System.out.println("Computer Win");
            }
        }
    }
