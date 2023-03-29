package com.functions;

import java.util.Scanner;

// Write a function which takes in 2 numbers and returns the greater of those two.
public class greatestOfTwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two numbers for printing greatest b/w both :- ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int great = greatestOfTwo(n, m);
        System.out.println(great);
    }

    public static int greatestOfTwo(int n, int m) {
        return n>m?n:m;      // ternary ope
    }
}
