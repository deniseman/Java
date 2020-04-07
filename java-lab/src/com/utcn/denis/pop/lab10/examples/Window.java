package com.utcn.denis.pop.lab10.examples;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextArea jTextArea;

    public Window() throws HeadlessException {
        setTitle("Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(200,300);

        jButton1=new JButton("Butonul 1");
        jButton1.setBounds(10,10,80,50);
        jButton2=new JButton("Butonul 2");
        jButton2.setBounds(100,10,80,50);
        jTextField1=new JTextField();
        jTextField1.setBounds(10,70,80,50);
        jTextField2=new JTextField();
        jTextField2.setBounds(100,70,80,50);
        jTextArea=new JTextArea();
        jTextArea.setBounds(10,160,170,100);

        add(jButton1);add(jButton2);add(jTextField1);add(jTextField2);add(jTextArea);

        revalidate();
        repaint();



    }
}
