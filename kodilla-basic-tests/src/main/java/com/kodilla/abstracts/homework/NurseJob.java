package com.kodilla.abstracts.homework;

public class NurseJob extends Job{

    public NurseJob(double salary, String resposibilites) {
        super(salary, resposibilites);
    }

    @Override
    public String toString() {
        return "Nurse" + super.toString();
    }
}