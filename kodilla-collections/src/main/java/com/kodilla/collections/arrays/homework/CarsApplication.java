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
        int drawnCarKind = random.nextInt(2);     // possible values: 0, 1
        int getSpeed = random.nextInt(10);
        int increaseSpeed = random.nextInt(100);
        int decreaseSpeed = random.nextInt(50);
        if (drawnCarKind == 0)
            return new Opel(getSpeed , decreaseSpeed, increaseSpeed);
        else if (drawnCarKind == 1)
            return new Ford(getSpeed , increaseSpeed , decreaseSpeed);
        return null;
    }

}