package com.utcn.denis.pop.lab9.ex2;

import javax.swing.*;

public class Window extends JFrame {
    private JButton bCount;
    private JTextField jt;
    private int count = 0;

    Window() {
        setTitle("Button Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(300, 300);
        this.setVisible(true);

        bCount = new JButton("Try me, boss");
        bCount.setBounds(10, 50, 160, 50);

        jt = new JTextField();
        jt.setBounds(10, 120, 30, 40);
        this.add(jt);
        this.add(bCount);
        countRead();
        bCount.addActionListener(e -> {
            count++;
            countRead();
        });
    }
    private void countRead(){
        jt.setText(String.valueOf(count));
        this.repaint();
    }
}
