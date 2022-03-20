package com.kodilla.abstracts.homework;

public class Prostokat extends Shape{
    private double a;
    private double b;

    Prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double pole(){
        return a*b;
    }

    @Override
    public double obwod(){
        return 2*a+2*b;
    }
}
