package com.utcn.denis.pop.lab7.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\java-lab\\src\\com\\utcn\\denis\\pop\\lab7\\ex2\\Data.txt"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Insert a character");
            char c = (char) in.read();
            String string = br.readLine();
            int n = string.length();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (c == string.charAt(i)) {
                    count++;
                }
            }
            System.out.println("Count: " + count);
        } catch (Exception e) {
            System.out.println("404");
        }

    }
}
