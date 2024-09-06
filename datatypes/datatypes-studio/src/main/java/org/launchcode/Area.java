package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a positive number for the radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("Radius must be a number - try again!");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);
        input.close();
        double area = Circle.getArea(radius);
        System.out.printf("The area of a circle of radius %s is: %s%n", radius, area);
    }
}

