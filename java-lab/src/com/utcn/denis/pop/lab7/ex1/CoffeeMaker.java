package com.utcn.denis.pop.lab7.ex1;

class CoffeeMaker {
    Coffee makeCoffee(){
        System.out.println("Make a coffe");
        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        Coffee coffee = new Coffee(t,c);
        return coffee;
    }

}