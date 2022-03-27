package com.kodilla.collections.interfaces.homework;

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
        return speed + increaseSpeed - decreaseSpeed;
    }

    @Override
    public int increaseSpeed() {
        return speed + 3 * increaseSpeed;
    }

    @Override
    public int decreaseSpeed() {
        return speed + 2 * decreaseSpeed;
    }
}
