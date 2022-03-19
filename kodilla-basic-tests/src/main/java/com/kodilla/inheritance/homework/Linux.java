package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{

    public Linux(int publishYear) {
        super(publishYear);
        System.out.println("This is Linux");
    }

    @Override
    public void turnOn(){
        System.out.println("Linux turned On");
    }
    @Override
    public void turnOff(){
        System.out.println("Linux turned Off");
    }
}
