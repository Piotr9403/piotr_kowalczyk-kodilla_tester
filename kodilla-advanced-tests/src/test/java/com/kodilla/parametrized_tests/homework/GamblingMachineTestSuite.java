package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

@ParameterizedTest
@CsvFileSource(resources = "/intGamblingMachineFailTest.csv")
public void shouldThrowExceptionWithInvalidNumbersProvided(String numbers) {
    String[] expectedArray = numbers.split(",");
    Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
    List<Integer> numbersToValidate = expectedSet
            .stream()
            .map(u -> Integer.parseInt(u))
            .collect(Collectors.toList());
    Set<Integer> expectedParsed = new HashSet<>(numbersToValidate);
    Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.validateNumbers(expectedParsed));
}

    @ParameterizedTest
    @CsvFileSource(resources = "/intGamblingMachinePassTest.csv")
    public void shouldNotCountWinsWithInvalidNumbersProvided(String numbers) throws InvalidNumbersException {
        String[] expectedArray = numbers.split(",");
        Set<String> expectedSet = new HashSet<>(Arrays.asList(expectedArray));
        List<Integer> numbersToValidate = expectedSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> expectedParsed = new HashSet<>(numbersToValidate);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(expectedParsed));
    }

    @Test
    public void shouldPassedIfNumberIsSix() throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> numbers = Stream.of(1,2,3,4,5,6).collect(Collectors.toSet());
        int number = gamblingMachine.howManyWins(numbers);
        assertTrue(number >=0 && number <=6);
    }
}