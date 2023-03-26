package com.patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        System.out.println("Opposite Right Angle Triangle");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        int st = 1;
        int sp = n - 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            sp--;
            st++;
        }
    }
}
