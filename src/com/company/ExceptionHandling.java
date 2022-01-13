package com.company;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int [] marks = new int [5];
        marks[0]=12;
        marks[1]=122;
        marks[2]=121;
        marks[3]=123;
        marks[4]=56;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index you want to divide");
        int index = sc.nextInt();

        System.out.println("enter the divider");
        int divider = sc.nextInt();



        try{
            System.out.println("the number you selected is " + marks[index]);
            System.out.println("the number you want to divide marks  is" + divider);
            System.out.println("the result is " + marks[index]/divider);

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
        catch(Exception e){
            System.out.println(e);
        }



    }
}

