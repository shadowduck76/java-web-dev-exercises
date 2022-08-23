package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        Double radius = input.nextDouble();
        if ((radius < 0)||radius.isNaN()) {
            System.out.println("ERROR: INVALID INPUT!");
            return;
        }
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+ radius + " is: "+ area);

    }
}
