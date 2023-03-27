package com.patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        int sp = n - 1;
        int st = 1;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp--;
            st += 2;
            System.out.println();
        }
        st-=2;
        sp = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp++;
            st-=2;
            System.out.println();
        }
    }
}
