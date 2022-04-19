package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @Test
    public void testBMI() {
        Person person = new Person(1.68, 53);
        String result = person.getBMI();
        assertEquals("Normal (healthy weight)", result);
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.GetDataBMI#provideDataForTesting")
    public void shouldShowBMIResult(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }

}