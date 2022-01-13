package com.company;

public class Interface {
    public static void main(String[] args) {
        AvonCycle s = new AvonCycle();
        s.speed(4);


    }
}

interface Bicycle{
    public void Break(int decrease);
    public void speed(int increase);


}
class AvonCycle implements Bicycle{
    int speed = 7;
    @Override
    public void speed(int increase) {
        speed = speed + increase;
        System.out.println("the speed has been increase");
    }

    @Override
    public void Break(int decrease) {
        speed = speed - decrease;
        System.out.println("the bicycle is in hault");
    }
}
