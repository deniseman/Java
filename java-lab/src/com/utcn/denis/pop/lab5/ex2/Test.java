package com.utcn.denis.pop.lab5.ex2;

public class Test {
    public static void main(String[] args) {
        ProxyImage pi1 = new ProxyImage("img1.jpg", true);
        ProxyImage pi2 = new ProxyImage("img2.jpg", false);
        pi1.display();
        pi2.display();
    }
}
