package com.utcn.denis.pop.lab10.ex3;

public class Counter extends Thread {
    private int start;
    private int last;

    Counter(String name) {
        super(name);
    }


    public void setStart(int start) {
        this.start = start;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public void setStartLast(int start, int last) {
        this.setStart(start);
        this.setLast(last);
    }

    public void run() {
        for (int i = this.start; i < this.last; i++) {
            System.out.println(getName() + " i = " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + "!!!Done!!!");
    }
}