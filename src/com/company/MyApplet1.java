package com.company;
import java.applet.Applet;
import java.awt.*;

public class MyApplet1 extends Applet {
    Label L1,L2;
    TextField T1,T2;
    Button B1;
    @Override
    public void init(){
        L1 = new Label("FIRSTNUMBER");
        L2= new Label("SECONDNUMBER");
        T1 = new TextField();
        T2 = new TextField();
        B1 = new Button("add");
        add(L1);
        add(L2);
        add(T1);
        add(T2);
        add(B1);
        




    }


}
