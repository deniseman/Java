package com.utcn.denis.pop.lab7.ex1;

class Coffee {
    private int temp;
    private int conc;
    static int numberCoffee = 0;

    Coffee(int t, int c) {
        temp = t;
        conc = c;
        numberCoffee++;
    }

    int getTemp() {
        return temp;
    }

    static int getNumberCofee() {
        return numberCoffee;
    }

    int getConc() {
        return conc;
    }

    public String toString() {
        return "[coffee temperature=" + temp + ":concentration=" + conc + "]";
    }
}