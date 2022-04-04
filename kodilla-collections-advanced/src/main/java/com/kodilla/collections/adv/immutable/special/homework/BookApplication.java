package com.kodilla.collections.adv.immutable.special.homework;

import static com.kodilla.collections.adv.immutable.special.homework.BookManager.books;

public class BookApplication {
    public static void main(String[] args) {

        Book book1 = BookManager.createBook("JAVA", "Hortsman");
        Book book2 = BookManager.createBook("PHP&MYSQL", "Marcin Lis");
        Book book3 = BookManager.createBook("Silmalirion", "J.R.R Tolkien");
        Book book4 = BookManager.createBook("Silmalirion", "J.R.R Tolkien");

        System.out.println("Number of Positions: " + books.size());
        System.out.println("-----");
        for (Book book : books)
            System.out.println("Book and author: " + book);

        System.out.println("-----");
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1 == book3);
        System.out.println(book1.equals(book3));
        System.out.println(book2 == book3);
        System.out.println(book2.equals(book3));
        System.out.println(book3 == book4);
        System.out.println(book3.equals(book4));
    }
}
