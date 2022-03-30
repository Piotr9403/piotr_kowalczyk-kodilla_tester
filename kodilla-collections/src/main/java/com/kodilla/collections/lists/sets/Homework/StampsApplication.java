package com.kodilla.collections.lists.sets.Homework;


import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Polski",10.0,5,true));
        stamps.add(new Stamp("Niemiecki",5.0,6,false));
        stamps.add(new Stamp("Angielski",6.0,6,false));
        stamps.add(new Stamp("Niemiecki",5.0,6,false));
        stamps.add(new Stamp("Polski",10.0,5,true));


        System.out.println("Ilość znaczków w zbiorze: " + stamps.size());
        for (Stamp stamp : stamps) {
           System.out.println(stamp);
        }

    }
}
