package org.launchcode.java.demos.exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of a rectangle:");
        int length = input.nextInt();
        System.out.println("Enter Width of a rectangle");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("Area of rectangle with length is "+length+ " and width is "+width+ " = "+area);

    }
}
