package com.kodilla.parametrized_tests.homework;

public class InvalidNumbersException extends Throwable {
    public InvalidNumbersException() {
        super("Wrong numbers provided");
    }

}
