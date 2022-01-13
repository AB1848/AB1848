package com.company;
import java.applet.Applet;
import java.awt.Graphics;

public class imageApplets extends Applet {
    @Override
    public void paint(Graphics g){
        g.drawString("welcome",150,180);
        //System.out.println("this is the example of an java applets which is not called in a main method but is called in an html file which has a special applet tag to use such applets programs");
    }

}
