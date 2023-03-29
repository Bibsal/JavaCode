package com.functions;

import java.util.Scanner;

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public class CountPositiveNegZero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int positive = 0, negative = 0, zeros = 0;
        System.out.print("Press 1 to continue and 0 to stop :- ");
        int input = scn.nextInt();
        while(input == 1) {
            System.out.print("Enter your desired number :- ");
            int n = scn.nextInt();
            if(n > 0) {
                positive++;
            } else if(n < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.print("Press 1 to continue and 0 to stop :- ");
            input = scn.nextInt();
        }
        System.out.println("The total positive numbers were :- " + positive);
        System.out.println("The total negative numbers were :- " + negative);
        System.out.print("The total zeros were :- " + zeros);
    }
}
