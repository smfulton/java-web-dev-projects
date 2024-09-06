package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter the radius of your circle:");
            radius = input.nextDouble();
            if(radius < 0.0){
                System.out.println("Enter a positive number.");
            }
        }while(radius < 0.0);

        double area = Circle.getArea(radius);
        System.out.printf("The area of a circle of radius %s is %s%n",radius,area);
    }
}

