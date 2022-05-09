package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalFactory {

    @Bean
    public Dog createDog() {
        return new Dog();
    }
}