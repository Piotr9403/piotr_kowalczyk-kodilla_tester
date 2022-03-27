package com.kodilla.collections.interfaces;

import com.kodilla.collections.interfaces.Shape;

public class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }

}
