package com.patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        System.out.println("Printing Opposite Right Angle Triangle");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
