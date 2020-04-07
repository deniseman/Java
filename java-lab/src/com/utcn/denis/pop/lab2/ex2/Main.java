package com.utcn.denis.pop.lab2.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introdu un numar");
        int n = Integer.parseInt(br.readLine());
        switch (n) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 0:
                System.out.println("ZERO");
                break;
            default:
                System.out.println("404 not found");
        }
        if (n == 1)
            System.out.println("one");
        else if (n == 2) System.out.println("two");
        else if (n == 3) System.out.println("three");
        else if (n == 4) System.out.println("four");
        else if (n == 5) System.out.println("five");
        else if (n == 6) System.out.println("six");
        else if (n == 7) System.out.println("seven");
        else if (n == 8) System.out.println("eight");
        else if (n == 9) System.out.println("nine");
        else if (n == 0) System.out.println("zero");
        else System.out.println("404");
    }
}
