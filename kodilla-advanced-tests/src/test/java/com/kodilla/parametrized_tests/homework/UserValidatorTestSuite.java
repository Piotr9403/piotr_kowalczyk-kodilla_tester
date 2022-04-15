package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private  UserValidator userValidator = new UserValidator();

    //test zwracający ilość znaków powyżej 3 oraz ciąg znaków ze znakami specjalnymi
    @ParameterizedTest
    @ValueSource(strings = {"Piotr", "dog_and_cat", "MARIA", "7777999", "piotr..umba", "piotr_umba", "piotr-_umb.a"})
    public void shouldReturnTrueForUsernameMeetingTheRequirements(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }
    //test zawiera niedozwolony ciąg znaków oraz ilość mniejszą niż 3
    @ParameterizedTest
    @ValueSource(strings = {"aA", "eug*h", "Ula mula"})
    public void shouldReturnFalseForUsernameNotMeetingTheRequirements(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    //test zwraca username jeżeli jest null
    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfUsernameIsNull(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    //test zwraca adresy email z niedozwolonymi znakami
    @ParameterizedTest
    @ValueSource(strings = {"kowalczyk.piotr9403@gmail.com", "piot.r94@wp.pl", "piotr94@wp.pl"})
    public void shouldReturnTrueIfEmailMeetingTheRequirements(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"kowalczyk.piotrgmail.com", "piotrwp.pl" , "email@pl"})
    public void shouldReturnFalseIfEmailNotMeetingTheRequirements(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }
}