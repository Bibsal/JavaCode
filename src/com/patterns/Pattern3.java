package com.patterns;

import java.util.Scanner;

// Hollow Rectangle
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Printing Hollow Rectangle Pattern");
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        System.out.print("Enter the value of m :- ");
        int m = scn.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
