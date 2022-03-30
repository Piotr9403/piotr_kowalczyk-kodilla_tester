package com.kodilla.collections.lists.sets.Homework;

import java.util.Objects;

public class Stamp {

    private String name;
    private double width;
    private double height;
    private boolean stemped;

    public Stamp(String name, double width, double height, boolean stemped) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.stemped = stemped;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isStemped() {
        return stemped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 && Double.compare(stamp.height, height) == 0 && stemped == stamp.stemped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, stemped);
    }

    @Override
    public String toString() {
        String isStemped;
        if (stemped == true) {
            isStemped = "Poniższy znaczek jest ostemplowany";
            System.out.println(isStemped);
        }else {
            isStemped = "Poniższy znaczek nie jest ostemplowany";
            System.out.println(isStemped);
        }
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", stemped=" + stemped +
                '}';
    }
}