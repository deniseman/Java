package com.utcn.denis.pop.lab2.ex7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lifes = 3, rand, number;
        rand = (int) (random() * 10);
        while (lifes!=0) {
            System.out.println("Insert a number(0-9): ");
            number = Integer.parseInt(br.readLine());
            if (rand > number) {
                System.out.println("Too low");
                lifes--;
            } else if (rand < number) {
                System.out.println("Too high");
                lifes--;
            } else if (rand == number) {
                System.out.println("Congrats");
                new java.util.Scanner(System.in).nextLine();
                return;
            }
        }
    }
}
