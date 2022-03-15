package com.kodilla.petle;

public class User {
    private String name;
    private int age;

    //konstruktor i deklracja zmiennych
    public User(String name, int age) {
        //odwołanie do atrybutów klasy
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        //obiekty
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        //Każdy obiekt ma imię i wiek. Następnie zapisujemy te obiekty do tablicy:
        User[] users = {anna, betty, carl, david, eva, frankie};
        int result = 0;
        for (int i = 0; i < users.length; i++) {            // właściwość lenght sprawdza ile elementów jest w []
            result = result + users[i].age;
        }

        result = result / users.length;
        System.out.println(result);
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < result)
                System.out.println(users[i].name);
        }
    }
}