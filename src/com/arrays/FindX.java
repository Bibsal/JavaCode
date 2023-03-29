package com.arrays;

import java.util.Scanner;
// Linear Search
public class FindX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array :- ");
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter the value you want to find :- ");
        int x = scn.nextInt();
        int idx = findX(x, arr);
        if(idx == -1) {
            System.out.print("Element is not present in the array");
        } else {
            System.out.println(x + " is at index " + idx);
        }
    }

    public static int findX(int x, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
