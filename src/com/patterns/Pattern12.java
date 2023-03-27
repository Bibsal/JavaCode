// 101 Pattern, the logic here is that if the sum of i and j is even the we print 1 and if the sum is odd then we print 0..
package com.patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}
