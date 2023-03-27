// Printing a solid Rhombus
package com.patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Printing a solid Rhombus ");
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        int sp = n - 1;
        int st = n;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp--;
            System.out.println();
        }
    }
}
