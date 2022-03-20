package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(5);

        System.out.println("Kwadrat");
        System.out.println(kwadrat.obwod());
        System.out.println(kwadrat.pole());

        Prostokat prostokat = new Prostokat(6,7);

        System.out.println("Prostokąt");
        System.out.println(prostokat.obwod());
        System.out.println(prostokat.pole());

        Kolo kolo = new Kolo(9);

        System.out.println("Koło");
        System.out.println(kolo.obwod());
        System.out.println(kolo.pole());
    }
}
