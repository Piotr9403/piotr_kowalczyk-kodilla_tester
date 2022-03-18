package com.kodilla.Book;

public class Book<toString> {
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
    public String toString() {
        return author + ", " + title;
    }
}