
package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    public static void describeCar(Car car) {

        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed speed: " + car.getSpeed());
        car.increaseSpeed();
        System.out.println("Car increased speed: " + car.getSpeed());
        car.decreaseSpeed();
        System.out.println("Car decrease speed: " + car.getSpeed());

    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car name";
    }

}