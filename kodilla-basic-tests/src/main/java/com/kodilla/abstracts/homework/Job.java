package com.kodilla.abstracts.homework;

public abstract class Job {

    private double salary;
    private String resposibilites;

    public Job(double salary, String resposibilites) {
        this.salary = salary;
        this.resposibilites = resposibilites;
    }

    @Override
    public String toString() {
        return "{" + "salary= " + salary + " pln" + ", resposibilites=" + resposibilites + '\'' + '}';
    }
}