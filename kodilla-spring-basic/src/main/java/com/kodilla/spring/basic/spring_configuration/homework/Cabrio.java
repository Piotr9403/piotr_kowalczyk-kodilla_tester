package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime now = LocalTime.now();
        if (now.isBefore(LocalTime.of(20,0)) && now.isAfter(LocalTime.of(6,0))) {
            return false; }
        return true;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}