package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int publishYear; // aby miec dostep do zmiennej prywatnej potrzebny jest getter za pomoca którego mozemy dostac wartosc zmiennej

    public OperatingSystem(int publishYear) {
        this.publishYear = publishYear;
    }
    public void turnOn() {
        System.out.println("OperatingSystem turned On");
    }
    public void turnOff() {
        System.out.println("OperatingSystem turned Off");
    }
    //getter (dostep do prywatnego pola publishYear)
    public int getPublishYear() {
        return publishYear;
    }
}
