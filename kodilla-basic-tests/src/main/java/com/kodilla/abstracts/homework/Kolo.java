package com.kodilla.abstracts.homework;

public class Kolo extends Shape {
    private double PI = 3.14;
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double pole() {
        return PI * r * r;
    }

    @Override
    public double obwod() {
        return 2 * (PI + r);
    }


}
