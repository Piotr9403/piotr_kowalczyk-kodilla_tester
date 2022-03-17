package com.kodilla.Book;

public class Book {
    //Pola
    private String author;
    private String title;

    //stworzenie konstuktora i przypisanie zmiennej do atrybutu klasy
    public Book(String author, String title) {              //typowanie argumentów
        this.author = author;
        this.title = title;

    }
    //przyjęcie parametru autora oraz tytułu
    public static Book of(String author, String title) {    //Statyczna metoda zwracająca obiekt book
        Book book = new Book(author, title);                //utworzenie obiektu book
        return book;                                        //zwrócenie obiektu book
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");// Inicjalizacja zmiennej Book za pomoca metody of
        System.out.println(("Autor: " + book.author + " " + "Tytuł: " + book.title));

    }
}