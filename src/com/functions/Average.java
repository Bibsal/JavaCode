package com.functions;

import java.util.Scanner;

// Enter 3 numbers from the user & make a function to print their average.
public class Average {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter three numbers for printing their average :- ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int o = scn.nextInt();
        int avg = averageOfThree(n, m, o);
        System.out.println(avg);
    }

    public static int averageOfThree(int n, int m, int o) {
        int sum = n + m + o;
        return sum/3;
    }
}
