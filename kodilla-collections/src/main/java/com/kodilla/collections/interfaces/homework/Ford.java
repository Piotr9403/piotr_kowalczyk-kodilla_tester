package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {

    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Ford(int speed, int increaseSpeed, int decreaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 3 * increaseSpeed;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 2 * decreaseSpeed;
        if(speed < 0){
            speed = 0;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed && increaseSpeed == ford.increaseSpeed && decreaseSpeed == ford.decreaseSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, increaseSpeed, decreaseSpeed);
    }
}