package com.company;

public class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("we are learning inheritance ");
    }
}

class Derived extends Base {
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    class Inheritance{
        public static void main(String[] args) {
            Derived d = new Derived();
            d.setX(12);
            System.out.println( d.getX());

        }
    }


