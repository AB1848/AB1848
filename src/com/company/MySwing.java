package com.company;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class MySwing extends JFrame {
    MySwing() {
        JPanel JPANEL = new JPanel();
        JPANEL.setBackground(Color.gray);
        JButton jbt = new JButton("login");
        JButton jbt2 = new JButton("sign up");
        JLabel  jLabel= new JLabel("username:");
        JLabel  jLabel2= new JLabel("password");
        JTextField jTextField = new JTextField("enter your username");
        JPasswordField jTextField2  = new JPasswordField("88888888");
        JCheckBox jCheckBox = new JCheckBox("THIS IS CHECK BOX");
        JRadioButton jRadioButton = new JRadioButton("male");
        JRadioButton jRadioButton1 = new JRadioButton("female");
        JRadioButton jRadioButton2 = new JRadioButton("other");

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);


        String [] Country = {"Nepal","India","China","Bhutan"};
        JComboBox jComboBox = new JComboBox(Country);
        String[] Header = {"NAME","ROLL NO","CLASS"};
        String[][] content = {
                {"hari","10","1"},
                {"haribol","20","12"}
        };
        JTable jTable = new JTable(content,Header);
        JScrollPane jScrollPane = new JScrollPane(jTable);


        DefaultMutableTreeNode mainnode = new DefaultMutableTreeNode("menu");
        DefaultMutableTreeNode childnode = new DefaultMutableTreeNode("menu item");
        DefaultMutableTreeNode grandchild = new DefaultMutableTreeNode("1");
        DefaultMutableTreeNode grandchild2 = new DefaultMutableTreeNode("2");

        JTree jtree = new JTree(mainnode);
        mainnode.add(childnode);
        childnode.add(grandchild);
        childnode.add(grandchild2);



        JPANEL.add(jScrollPane);
        JPANEL.add(jLabel);
        JPANEL.add(jTextField);
        JPANEL.add(jLabel2);
        JPANEL.add(jTextField2);
        JPANEL.add(jbt);
        JPANEL.add(jbt2);
        JPANEL.add(jCheckBox);
        JPANEL.add(jRadioButton);
        JPANEL.add(jRadioButton1);
        JPANEL.add(jRadioButton2);
        JPANEL.add(jComboBox);
        JPANEL.add(jtree);




        add(JPANEL);


        setTitle("FORM");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

    class Swing {
        public static void main(String[] args) {
            new MySwing();
        }
    }
