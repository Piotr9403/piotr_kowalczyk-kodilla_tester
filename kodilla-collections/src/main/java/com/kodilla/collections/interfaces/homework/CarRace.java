package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(0,50,20);
        doRace(ford);

        Opel opel = new Opel(0,50,40);
        doRace(opel);

    }
    private static void doRace(Car car) {
        System.out.println("Prędkość początkowa: " + car.getSpeed());
        System.out.println("Prędkość zwiększająca: " + car.increaseSpeed());
        System.out.println("Prędkość zmniejszająca: " +car.decreaseSpeed());
    }
}
