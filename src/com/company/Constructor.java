package com.company;

public class Constructor{
    int size;
    String name;

     public Constructor(){
         String name = "Ashish";
         int size = 65;

     }
     public Constructor(String n,int b){
         size = b;
         name = n;

     }

     int getSize(){return size;}
    void setSize(int b){this.size=b;}
    String getName(){return name;}
    void setName(String n){this.name=n;}
}
