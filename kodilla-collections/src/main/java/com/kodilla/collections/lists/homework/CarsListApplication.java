package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        System.out.println("-----------------------------");
        Ford ford = new Ford(10, 30, 15);
        cars.add(ford);
        cars.add(new Opel(5, 50, 20));
        System.out.println("Początkowy rozmiar kolekcji: " + cars.size() + ".");

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        System.out.println("-----------------------------");
        cars.remove(1);
        System.out.println("Rozmiar kolekcji wynosi: " + cars.size() + ".");
        cars.remove(ford);
        System.out.println("Rozmiar kolekcji wynosi: " + cars.size() + ".");

    }
}