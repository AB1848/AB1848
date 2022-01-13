package com.company;

public class Method {
    int logic(int x, int y)
    {
        int sum = 0;
        if(x > y){
            sum = x + y;
            System.out.println(sum);
        }
        else {
            System.out.println("x is smaller than y");

        }  return sum;
        
    }
}
