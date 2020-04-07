package com.utcn.denis.pop.lab7.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        ParkingLot pk = new ParkingLot();
        HashMap<String, Car> notParked = new HashMap<>();
        HashMap<String,Car> parked=new HashMap<>();
        boolean istrue = true;
        int chose;
        while (istrue) {
            System.out.println("Welcome to Jimmy's Piata Unirii");
            System.out.println("1 Add Car");
            System.out.println("2 Get in a Car");
            System.out.println("3 Park Car");
            System.out.println("4 Get Last Car");
            System.out.println("5 Get All Cars");
            System.out.println("6 Number of Cars");
            System.out.println("7 Get out a Car");
            System.out.println("8 Exit");
            System.out.println("Boobye");
            Scanner in = new Scanner(System.in);
            chose = in.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("Enter Brand name: ");
                    String brandName = in.next();
                    System.out.println("Number id: ");
                    String numberId = in.next();
                    System.out.println("HorsePower: ");
                    int horsePower = in.nextInt();
                    Car c = new Car(brandName, numberId, horsePower);
                    notParked.put(c.getNumberID(), c);
                    break;
                case 2:
                    System.out.println("Car id: ");
                    numberId = in.next();
                    c = notParked.get(numberId);
                    if (c == null) {
                        System.out.println("The Car Id is not found");
                    }else {
                        System.out.println(c.toString());
                    }
                    break;
                case 3:
                    pk.parkCar(notParked,"D:\\java\\java-lab\\src\\com\\utcn\\denis\\pop\\lab7\\ex3\\park.txt");
                    break;
                case 4:
                    parked=pk.checkCar("D:\\java\\java-lab\\src\\com\\utcn\\denis\\pop\\lab7\\ex3\\park.txt");
                    System.out.println("Car ID: ");
                    numberId = in.next();
                    c = parked.get(numberId);
                    if (c == null) {
                        System.out.println("Car ID not found");
                    }else {
                        System.out.println(c.toString());
                    }
                    break;
                case 5:
                    parked=pk.checkCar("D:\\java\\java-lab\\src\\com\\utcn\\denis\\pop\\lab7\\ex3\\park.txt");
                    for (Map.Entry<String, Car> e : parked.entrySet()) {
                        System.out.println(e.getValue().toString());
                    }
                    break;
                case 6:
                    System.out.println("Number of cars created: "+ Car.getNumber());
                    System.out.println("Number of cars in parking lot: "+parked.size());
                    break;
                case 7:
                    System.out.println("Number id: ");
                    numberId = in.next();
                    parked.remove(numberId);
                    notParked.remove(numberId);
                    pk.parkCar(notParked,"D:\\java\\java-lab\\src\\com\\utcn\\denis\\pop\\lab7\\ex3\\park.txt");
                    break;
                case 8:
                    istrue=false;
                    break;
                default:
                    System.out.println("Error 404 ");
                    break;


            }
        }

    }
}
