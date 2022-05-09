package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarApplication {

    @Bean
    public String season() {
        return "winter";
    }

    @Bean
    public Car chooseCar(String season) {
        String spring = "spring";
        String winter = "winter";
        String autumn = "autumn";

        Car car;
        if (season == spring || season == autumn) {
            car = new Sedan();
        } else if (season == winter) {
            car = new Suv();
        } else {
            car = new Cabrio();
        }
        return car;
    }
}