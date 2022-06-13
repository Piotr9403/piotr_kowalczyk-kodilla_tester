package com.kodilla.jacoco;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4() {

        //given
        Year year = new Year(2012);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYear() {

        //given
        Year year = new Year(2022);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearException() {

        //given
        Year year = new Year(1900);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }


}