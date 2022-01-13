package com.company;

public class Switch {
    public static void main(String[] args) {
        int var = 45;
        switch (var) {
            case 25:
                System.out.println("you are young");
                break;
            case 35:
                System.out.println("you are married");
                break;
            case 45:
                System.out.println("you are starting to get matured ");
            default:
                System.out.println("BE  happy age is just a number ");
        }
    }
}