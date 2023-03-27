/*

*                   *
*   *           *   *
*   *   *   *   *   *
*   *   *   *   *   *
*   *           *   *
*                   *

*/
package com.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = scn.nextInt();
        int sp = 2 * n - 2;
        int st = 1;
        for(int i = 1; i <= n; i++) {
            // upper part
            for(int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            for(int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for(int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp-=2;
            st++;
            System.out.println();
        }
        st = n;
        sp = 0;
        for(int i = 1; i <= n; i++) {
            // lower part
            for(int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            for(int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for(int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            st--;
            sp+=2;
            System.out.println();
        }
    }
}
