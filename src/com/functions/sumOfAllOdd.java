package com.functions;

import java.util.Scanner;

// Write a function to print the sum of all odd numbers from 1 to n.
public class sumOfAllOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sod = sumofodd(n);
        System.out.println("The sum of all odds from 1 to " + n + " is " + sod);
    }

    public static int sumofodd(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
