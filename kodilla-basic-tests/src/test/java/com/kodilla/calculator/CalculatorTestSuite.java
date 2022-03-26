package com.kodilla.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestSuite {
    @Test
    void testSum() {
        //given - dane przed wykonaniem testu
        Calculator calculator = new Calculator();
        //when - wywołanie testowanej metody
        double result = calculator.sum(-2, 10);
        //then - sprawdzamy asercje (poprawne wykonanie testu)
        assertEquals(8, result, 0.001);
    }

    @Test
    void testSub() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.subtract(16, 4);
        //then
        assertEquals(12, result, 0.001);
    }

    @Test
    void testPowlessZero() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.power(-5);
        //then
        assertEquals(25, result, 0.001);

    }

    @Test
    void testPowZero() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.power(0);
        //then
        assertEquals(0, result, 0.001);
    }

    @Test
    void testPowGreaterZero() {
        //given
        Calculator calculator = new Calculator();
        //when
        double result = calculator.power(3);
        //then
        assertEquals(9, result, 0.001);

    }

}