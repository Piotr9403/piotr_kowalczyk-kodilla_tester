package com.kodilla.abstracts.homework;

public class PoliceJob extends Job {

    public PoliceJob(double salary, String resposibilites) {
        super(salary, resposibilites);
    }

    @Override
    public String toString() {
        return "Policeman" + super.toString();
    }
}