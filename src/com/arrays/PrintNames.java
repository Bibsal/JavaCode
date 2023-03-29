package com.arrays;

import java.util.Scanner;
//Take an array of names as input from the user and print them on the screen.
public class PrintNames {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("How many names do you want to store :- ");
        int size = scn.nextInt();
        String[] arr = new String[size];
        //taking names
        for(int i = 0; i < size; i++) {
            arr[i] = scn.next();
        }
        //printing the names
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }
}
