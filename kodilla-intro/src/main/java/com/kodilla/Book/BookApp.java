package com.kodilla.Book;

import com.sun.jdi.connect.Connector;

public class BookApp {
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");// Inicjalizacja zmiennej Book za pomoca metody of
        System.out.println(("Autor: " + book.author + " " + "Tytuł: " + book.title));


    }
}
