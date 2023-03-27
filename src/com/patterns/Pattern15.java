package com.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        int sp = n-1;
        int st = 1;
        int val;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            val = i;
            for(int j = 1; j <= st; j++) {
                System.out.print(val+"\t");
                if(j <= st/2 && val > 1) {
                    val--;
                } else {
                    val++;
                }
            }
            sp--;
            st+=2;
            System.out.println();
        }
    }
}
