package com.company;

public class Abstract {
    public static void main(String[] args) {
       child2 obj = new child2();
       obj.greet1();
       obj.printme();
    }
}

abstract  class parent
{
    public void printme(){
        System.out.println("this is me ");

    }
    abstract void greet1();

}

class child extends parent{
    void greet1(){
        System.out.println("goodmorning everyone ");
    }
}
 class child2 extends parent{
    @Override
    public void printme() {
        super.printme();

    }

     @Override
     void greet1() {
         System.out.println("asalam wallekum");
     }
 }
