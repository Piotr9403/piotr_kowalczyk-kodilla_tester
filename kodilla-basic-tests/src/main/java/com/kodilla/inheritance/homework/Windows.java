package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int publishYear) {
        super(publishYear);
        System.out.println("This is Windows");
    }

    @Override
    public void turnOn(){
        System.out.println("Windows turned On");
    }
    @Override
    public void turnOff(){
        System.out.println("Windows turned Off");
    }
}
