package com.patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        int val = 1;
        for(int i = 1; i <= n; i++) {
//            if(val == 0) {
//                val = 1;
//            }
            for(int j = 1; j <= i; j++) {
                System.out.print(val+"\t");
                if(val == 1) {
                    val = 0;
                } else if(val == 0) {
                    val = 1;
                }
            }
            System.out.println();
        }
    }
}
