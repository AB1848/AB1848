package com.company;

public class LearningThreadByExtendingThreadClass{
    public static void main(String[] args) {
        MyThread1 ob = new MyThread1();
        MyThread2 obj= new MyThread2();
        ob.start();
        obj.start();

    }


}
class MyThread1 extends Thread {
    @Override
    public void run() {
        int i =0;
        while ( i < 1200) {
            System.out.println("this is my thread 1 RUNNING ");
            i++;
        }
    }
}
        class MyThread2 extends Thread {
            @Override
            public void run() {
                int i = 0;
                while (i < 1200) {
                    System.out.println("this is my thread 2 RUNNING ");
                    i++;
                }
            }
        }
