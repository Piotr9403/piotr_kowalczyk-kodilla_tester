package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private double value;
    private LocalDate dateOfIssue;
    private String login;

    public Order(double value, LocalDate dateOfIssue, String login) {
        this.value = value;
        this.dateOfIssue = dateOfIssue;
        this.login = login;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order {" +
                "value=" + value +
                '}';
    }
}
