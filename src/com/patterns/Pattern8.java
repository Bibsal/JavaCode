package com.patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Printing numbers 12345....");
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++) {
            int val = 1;
            for(int j = 1; j <= i; j++) {
                System.out.print(val++ + "\t");
            }
            System.out.println();
        }
    }
}
