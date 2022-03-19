package com.kodilla.inheritance.homework;

public class App {
    public static void main(String[] args) {
        //OperatingSystem
        OperatingSystem system = new OperatingSystem(1990);
        System.out.println(system.getPublishYear()); // wywowłanie gettera
        //Linux extends OperatingSystem
        Linux linux = new Linux(2000);
        System.out.println(linux.getPublishYear()); // wywołanie gettera z OperatingSystem

        //Windows extends OperatingSystem
        Windows windows = new Windows(2010);
        System.out.println(windows.getPublishYear()); // wywołanie gettera z OperatingSystem

        linux.turnOn();
        linux.turnOff();

        windows.turnOn();
        windows.turnOff();
    }
}
