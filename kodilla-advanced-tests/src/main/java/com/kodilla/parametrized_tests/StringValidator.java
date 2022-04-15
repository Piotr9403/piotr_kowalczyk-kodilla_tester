package com.kodilla.parametrized_tests;

public class StringValidator {

    public boolean isBlank(String text) {

        //Metoda zwraca true, gdy przekazana wartość jest równa null lub gdy text pozbawiony spacji (trim()) jest pusty.
        return text == null || text.trim().isEmpty();
    }
}
