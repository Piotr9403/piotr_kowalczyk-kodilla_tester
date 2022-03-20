package com.kodilla.abstracts.homework;

public class Kwadrat extends Shape {
    private double a;

    Kwadrat(double a){
        this.a = a;
    }

    @Override
    public double pole(){
        return a*a;
    }

    @Override
    public double obwod(){
        return 4*a;
    }
}
