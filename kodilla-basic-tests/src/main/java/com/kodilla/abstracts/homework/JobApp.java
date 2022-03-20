package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {

        PoliceJob policeJob = new PoliceJob(1000, "Wlepianie mandatów");
        //System.out.println(policeJob);
        Person person = new Person("Piotr", 18,policeJob);
        System.out.println(person);
        Person person2 = new Person("Adam", 20,new NurseJob(2000, "Lecze ludzi"));
        System.out.println(person2);
    }
}