package com.company;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    Menu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("file");
        JMenu view = new JMenu("view");
        JMenu saveas = new JMenu("saveas");

        JMenuItem openitem = new JMenuItem("open");
        JMenuItem saveitem = new JMenuItem("saveitem");
        JMenuItem pdf = new JMenuItem("pdf");
        JMenuItem png = new JMenuItem("png");


        add(menuBar);
        menuBar.add(file);
        menuBar.add(view);
        file.add(saveas);
        saveas.add(pdf);
        saveas.add(png);
        view.add(saveitem);
        view.add(openitem);





        setLayout(new FlowLayout());
        setTitle("MENU");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}
class Aashish {
    public static void main(String[] args) {
        new Menu();

    }
}