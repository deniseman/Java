package com.utcn.denis.pop.lab4.ex2;

public class AuthorTest {
    public static void main(String[] args) {
        Author a = new Author("Gigel Frone", "notengodinero@gmail.com", 'm');
        a.setEmail("stillnomoney@gmail.com");
        System.out.println(a.getEmail() + " " + a.getName() + " " + a.toString());
    }
}