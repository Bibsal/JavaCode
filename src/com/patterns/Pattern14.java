package com.patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        int sp = n/2;
        int val = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(val+"\t");
            }
            sp++;
            val++;
            System.out.println();
        }
    }
}
