package com.company;
import java.util.Scanner;



public class AreaOfRectangle {
    public static void main(String[] args)
    {
        System.out.println("finding the area of rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle:");
        double length = sc.nextDouble();
        System.out.println("enter the breadth of rectangle:");
        double breadth = sc.nextDouble();

        double area = length*breadth;
        System.out.println("the area of rectangel is");
        System.out.println(area);





    }
}
