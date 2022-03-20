package com.kodilla.abstracts;

public class Duck extends Animal {

    public Duck() {
        //korzysta z konstruktora z klasy animal z argumentem 2, który przypisuje wartość number of legs
        super(2);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }
}