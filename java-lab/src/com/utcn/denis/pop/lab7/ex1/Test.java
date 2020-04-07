package com.utcn.denis.pop.lab7.ex1;

public class Test {
    public static void main(String[] args) {
        CoffeeMaker mk = new CoffeeMaker();
        CoffeeDrinker d = new CoffeeDrinker();

        for (int i = 0; i < 15; i++) {
            Coffee c = mk.makeCoffee();
            try {
                d.drinkCoffee(c);
            } catch (OutOfNumberException e) {
                System.out.println("Exception: " + e.getMessage() + " number of coffee= " + e.getNumber());
            }catch (TemperatureException e) {
                System.out.println("Exception: " + e.getMessage() + " temp=" + e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception: " + e.getMessage() + " conc=" + e.getConc());
            }
            finally {
                System.out.println("Throw cup.\n");
            }
        }
    }
}