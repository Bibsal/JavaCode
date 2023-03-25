package com.patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println("Printing Right Angle Triangle");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
