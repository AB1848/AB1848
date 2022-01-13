package com.company;
import java.util.Scanner;

public class GettingUserValue {
    public static void main(String[] args) {
        System.out.println("taking user value");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int A = sc.nextInt();
        System.out.println("enter second number:");
        int B = sc.nextInt();
        int sum = A + B;
        System.out.print("the sum of given number is:");
        System.out.println(sum);



    }

}
