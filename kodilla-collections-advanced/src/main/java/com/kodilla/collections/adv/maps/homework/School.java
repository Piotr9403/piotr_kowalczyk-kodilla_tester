package com.kodilla.collections.adv.maps.homework;

import java.util.List;

public class School {
    private String name;
    private List<Integer> numberOfStudents;

    public School(String name, List<Integer> numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        int sum = 0;
        for (Integer studentsInClass : numberOfStudents)
            sum += studentsInClass;
        return "Szkoła [" + name + ", ilość uczniów: "  + sum + "]";
    }
}
