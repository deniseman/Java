package com.utcn.denis.pop.lab4.ex5;

public class Test {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(34);
        Cylinder c3 = new Cylinder(23, 12);
        System.out.println(c1.getHeight() + " " + c2.getHeight() + " " + c3.getHeight() + "\n");
        System.out.println(c1.getVolume() + " " + c2.getVolume() + " " + c3.getVolume());
    }
}