package com.utcn.denis.pop.lab7.ex1;

class CoffeeDrinker {
    void drinkCoffee(Coffee c) throws TemperatureException, ConcentrationException, OutOfNumberException {
        if (Coffee.numberCoffee > 10)
            throw new OutOfNumberException(Coffee.getNumberCofee(), "Out of coffee");
        if (c.getTemp() > 60)
            throw new TemperatureException(c.getTemp(), "Too hot!");
        if (c.getConc() > 50)
            throw new ConcentrationException(c.getConc(), "Concentration to high!");
        System.out.println("Drink coffee:" + c);
    }
}