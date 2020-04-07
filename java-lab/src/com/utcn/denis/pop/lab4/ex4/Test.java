package com.utcn.denis.pop.lab4.ex4;

import com.utcn.denis.pop.lab4.ex2.Author;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Author[] aut = new Author[3];
        aut[0] = new Author("Gijel", "gi@", 'm');
        aut[1] = new Author("mascul alfa", "alfa@g", 'm');
        aut[2] = new Author("femela beta", "beta@g", 'f');
        Book b = new Book("Book of Ra", aut, 32, 4);
        System.out.println(b.toString() + "\n");
        b.setPrice(45);
        b.setQtyInStock(56);
        b.printAuthors();
        System.out.println(Arrays.toString(b.getAuthor()) + " " + b.getName() + " " + b.getPrice() + " " + b.getQtyInStock());
    }
}