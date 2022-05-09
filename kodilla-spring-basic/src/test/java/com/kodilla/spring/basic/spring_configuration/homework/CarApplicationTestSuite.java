package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class CarApplicationTestSuite {

    @Test
    public void shouldReturnCarTypeAccordingToWinter() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCar");
        String type = car.getCarType("winter");
        Assertions.assertEquals("SUV", type);
    }

    @Test
    public void shouldReturnCarTypeAccordingToSummer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCar");
        String type = car.getCarType("winter");
        Assertions.assertNotEquals("Sedan", type);
    }


    @Test
    public void shouldTurnLightsOffBetween6And20() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Suv suv = (Suv) context.getBean(Suv.class);
        Boolean result = suv.hasHeadlightsTurnedOn(LocalTime.of(19, 59));
        Assertions.assertEquals(false, result);
    }

    @Test
    public void shouldTurnLightsOnBetween20And6() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Suv suv = (Suv) context.getBean(Suv.class);
        Boolean result = suv.hasHeadlightsTurnedOn(LocalTime.of(5, 59));
        Assertions.assertEquals(true, result);
    }
}