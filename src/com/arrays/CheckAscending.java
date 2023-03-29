package com.arrays;

import java.util.Scanner;

/*
Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.
*/
public class CheckAscending {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int n = scn.nextInt();
        boolean isAscending = true;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] < arr[i+1]) {
                isAscending = true;
            } else {
                isAscending = false;
                break;
            }
        }
        if(isAscending == true) {
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.print(" is in Ascending order");
        } else {
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.print(" is not in Ascending order");
        }
    }
}
