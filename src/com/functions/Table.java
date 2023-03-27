package com.functions;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Which number table do you want :- ");
        int n = scn.nextInt();
        tableMult(n);
    }

    public static void tableMult(int n) {
        for(int i = 1; i <= 12; i++) {
            System.out.println(n + " * " + i +" = " + n * i);
        }
        System.out.println("Do you want the multiples further for " + n + " , y/n ?");
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if(ch == 'y') {
            for(int j = 13; j <= 24; j++) {
                System.out.println(n + " * " + j + " = " + n * j);
            }
        } else {

        }
    }
}
