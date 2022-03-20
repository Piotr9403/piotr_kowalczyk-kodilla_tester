package com.kodilla.abstracts;

// extendes Animal oznacza, że dziedziczymy z klasy Animal
public class Dog extends Animal{

    public Dog() {
        super(4);
    }
    @Override
    public void giveVoice() {
        System.out.println("Hau hau");

    }

}
