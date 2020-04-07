package com.utcn.denis.pop.lab10.ex1;

public class Counter extends Thread {

    Counter(String name){
        super(name);
    }

    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(getName() + " i = "+i);
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " one job done.");
    }

    public static void main(String[] args) {
        Counter c1 = new Counter("first counter");
        Counter c2 = new Counter("second counter");
        Counter c3 = new Counter("third counter");

        c1.run();
        c2.run();
        c3.run();
    }
}

