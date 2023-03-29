package com.arrays;

import java.util.Scanner;

//Find the maximum & minimum number in an array of integers.
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The max value of the array is :- " + max);
        System.out.print("The min value of the array is :- " + min);
    }
}
