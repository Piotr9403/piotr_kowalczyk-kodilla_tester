package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnResultOfSummation() {
        Double summation = bean.add(2.35,4.89);
        assertEquals(7.24, summation, 0.01);
    }

    @Test
    public void shouldReturnResultOfSubtraction() {
        Double subtraction = bean.subtract(2.35,4.89);
        assertEquals(-2.54, subtraction, 0.01);
    }

    @Test
    public void shouldReturnResultOfMultiplication() {
        Double multiplication = bean.multiply(2.35,4.89);
        assertEquals(11.4915, multiplication, 0.01);
    }

    @Test
    public void shouldReturnResultOfDivision() {
        Double division = bean.divide(2.35,4.89);
        assertEquals(0.48, division, 0.01);
    }

}