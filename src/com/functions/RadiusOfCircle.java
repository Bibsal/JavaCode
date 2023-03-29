package com.functions;

import java.util.Scanner;

// Write a function that takes in the radius as input and returns the circumference of a circle.
public class RadiusOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the radius of the circle to get it's circumference :- ");
        int radius = scn.nextInt();
        double roc = raidusOfCircle(radius);
        System.out.println("The circumference of the circle is " + roc);
    }

    public static double raidusOfCircle(double r) {
        return (2 * 3.14 * r);
    }
}
