package com.company;

public class VarArgs {
    int sum(int...arr)
    {
        //here arr is available as int [] arr.
        int results =0;
        for(int a: arr)

        {
           results +=a;
        }
        return results;


    }
}
