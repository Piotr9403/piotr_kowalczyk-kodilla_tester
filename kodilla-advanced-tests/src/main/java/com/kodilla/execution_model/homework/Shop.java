package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    //Dodanie nowego zamówienia
    Set<Order> orderList = new HashSet<>();

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

    //Zwrócenie listy z zakresu dwóch dat
    public List<Order> getOrderListBasedOnTheRangeOfTwoDates(LocalDate firstDate, LocalDate secondDate) {

        List<Order> twoDatesList = orderList
                .stream()
                .filter(o -> o.getDateOfIssue().isAfter(firstDate))
                .filter(on -> on.getDateOfIssue().isBefore(secondDate))
                .collect(Collectors.toList());
        if (twoDatesList.isEmpty())
            return orderList
                    .stream()
                    .filter(o -> o.getDateOfIssue().isAfter(firstDate))
                    .filter(on -> on.getDateOfIssue().isBefore(secondDate))
                    .collect(Collectors.toList());
        return null;

    }


    //pobranie zamówień na podstawie przekazanego zakresu
    public List<Order> getOrderListBasedOnTheMinAndMaxValue(double minValue, double maxValue) {
        if (minValue > maxValue) {
            return null;
        } else if (minValue == maxValue);
        List<Order> twoValuesList = orderList
                .stream()
                .filter(r -> r.getValue() >= minValue)
                .filter(or -> or.getValue() <= maxValue)
                .collect(Collectors.toList());
        if (twoValuesList.isEmpty()) {
            return null;
        }
        return twoValuesList;
    }


    public int getSize() {
        return this.orderList.size();
    }


    //zsumowanie wartości wszystkich zamówień.
    public double sumOrders() {
        if (orderList.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (Order order : this.orderList) {
            sum += order.getValue();
        }
        return sum;
    }

    //Wyczyszczenie listy
    public void clear() {
        this.orderList.clear();
    }
}