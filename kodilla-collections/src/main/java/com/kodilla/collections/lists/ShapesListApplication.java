package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        //Typ zmiennej przechowujący kolekcje List<Square> , nazwa zmiennej shapes
        //Nowy obiekt klasy ArrayList
        List<Square> shapes = new ArrayList<>();
        //Poniższy kod tworzy trzy obiekty: sq1, sq2, sq3, a następnie dodaje je do kolekcji shapes
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        //pętla for-each na kolekcji shapes.
        //W kolejnych iteracjach kolejne elementy z tej kolekcji będą umieszczane w zmiennej square,
        //która jest typu Square
        for (Square square : shapes) {
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
    }
}
