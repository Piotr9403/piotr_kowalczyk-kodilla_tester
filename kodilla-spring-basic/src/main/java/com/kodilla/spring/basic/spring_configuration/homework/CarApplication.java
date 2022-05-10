package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarApplication {

    @Bean
    public Car chooseCar() {
        Car car;
        LocalDate date = LocalDate.now();

        if (date.getMonthValue() == 12 || date.getMonthValue() == 1 || date.getMonthValue() == 2) {
            car = new Suv();
        } else if (date.getMonthValue() == 6 || date.getMonthValue() == 7 || date.getMonthValue() == 8) {
            car = new Cabrio();
        } else {
            car = new Sedan();

        }

        return car;
    }
}