package com.kodilla.exception.homework;


public class Order {
    String number;

    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Zamówienie " + "numer='" + number + '\'';
    }
}
