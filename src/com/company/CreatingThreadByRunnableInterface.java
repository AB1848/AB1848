package com.company;

public class CreatingThreadByRunnableInterface {
    public static void main(String[] args) {
        MyThread11 bullet = new MyThread11();
        Thread t1 = new Thread(bullet);

        MyThread12 bullet2= new MyThread12();
        Thread t2 = new Thread(bullet2);
        t1.start();
        t2.start();

    }
}
class MyThread11 implements Runnable{
    public void run(){
        int i = 0;
        while (i<110){
            System.out.println("this is thread 1 made using runnable interface");
            i++;
        }
    }
}
class MyThread12 implements Runnable{
    public void run(){
        int i = 0;
        while (i<110){
            System.out.println("this is thread 2 made using runnable interface");
            i++;
        }
    }
}