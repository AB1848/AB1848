package com.company;

import java.util.Scanner;
import java.util.Random;

import static java.lang.System.out;

public class RockPaperScissors {
    public static void main(String[] args) {
        int i = 0;
        int number = 0;
        int randomNum = 0;

        for (i = 0; i <= 3; i++)
        {
            Scanner sc = new Scanner(System.in);
            out.println("please enter your number accordingly 0:for rock,1:for scissor,2:for paper");
            number = sc.nextInt();
            switch (number) {
                case 0:
                    out.println("you selected rock");
                    break;
                case 1:
                    out.println("you selected scissor");
                    break;
                case 2:
                    out.println("you selected paper");
                    break;
                default:
                    out.println("please enter valid number");

            }


            Random random = new Random();
            randomNum = random.nextInt(3);
            out.println(randomNum);
            switch (randomNum) {
                case 0:
                    out.println("computer selected rock");
                    break;
                case 1:
                    out.println("computer selected scissor");
                    break;
                case 2:
                    out.println("computer selected paper");
                    break;
                default:
                    out.println("wait for result ");

            }



        if (number == randomNum)
        {
            out.println("gamedrawn");
        }
        else if ((number == 0 && randomNum == 1) || (number == 1 && randomNum == 2) || (number == 2 && randomNum == 0))
        {
            out.println("congratulations you win!!!!");
        }
        else {
            out.println("you lose !!!");
        }}

    }


}
