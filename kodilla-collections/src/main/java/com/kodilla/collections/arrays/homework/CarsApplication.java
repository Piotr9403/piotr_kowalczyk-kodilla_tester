package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCars();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCars() {
        Random random = new Random();
        // draw a kind of the car
        int drawnCarKind = random.nextInt(3);     // possible values: 0, 1, 2
        int a = random.nextInt();
        int b = random.nextInt();
        if (drawnCarKind == 0)
            return new Opel(10, 20, 30);
        else if (drawnCarKind == 1)
            return new Ford(30, 40, 50);
        return null;
//            else
//                return new Triangle(a, b, c);

    }
}