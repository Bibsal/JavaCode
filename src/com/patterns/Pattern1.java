package com.patterns;

import java.net.StandardSocketOptions;
// SQUARE PATTERN
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Printing Solid Square Pattern");
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
