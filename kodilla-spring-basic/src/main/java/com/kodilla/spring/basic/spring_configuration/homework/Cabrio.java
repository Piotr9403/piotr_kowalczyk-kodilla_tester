package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    LocalTime start = LocalTime.of(6, 00);
    LocalTime end = LocalTime.of(20,00);

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        if (time.isAfter(start) && time.isBefore(end)) {
            return false;
        }
        return true;
    }

    @Override
    public String getCarType(String season) {
        return "Cabrio";
    }
}