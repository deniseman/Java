package com.utcn.denis.pop.lab3.ex1;

public class Robot {
    int x;

    Robot() {
        this.x = 1;
    }

    void change(int k) {
        if (k >= 1)
            x += k;
        else System.out.println("Rong value");
    }

    void printPozition() {
        System.out.println("Curent Pozition:" + x);
    }
}