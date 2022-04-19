package com.kodilla.parametrized_tests;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;


import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(validator.isBlank(text));
    }



}