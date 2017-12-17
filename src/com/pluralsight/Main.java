package com.pluralsight;

public class Main {

/*
https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/
6-092-introduction-to-programming-in-java-january-iap-2010/assignments/

Assignment #1 GravityCalculator
 */

    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");


        //  x(t) = 0.5 × at2 + vit + xi

        double a = gravity;
        double t = fallingTime;
        double vi = initialVelocity;
        double xi = initialPosition;

        double x = 0.5 * (a*t*t) + (vi*t) + xi;

        System.out.println("The object's position after " + t +
                " seconds is " + x + " m.");





    }

}
