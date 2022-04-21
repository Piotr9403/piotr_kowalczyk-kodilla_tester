package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    //Dodanie nowego zamówienia
    private final Set<Order> orderList = new HashSet<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    //Zwrócenie listy z zakresu dwóch dat
    public List<Order> getOrderListBasedOnTheRangeOfTwoDates(LocalDate firstDate, LocalDate secondDate) {

        return orderList
                .stream()
                .filter(o -> o.getDateOfIssue().isAfter(firstDate))
                .filter(on -> on.getDateOfIssue().isBefore(secondDate))
                .toList();
    }

    //pobranie zamówień na podstawie przekazanego zakresu
    public List<Order> getOrderListBasedOnTheMinAndMaxValue(double minValue, double maxValue) {

        return orderList
                .stream()
                .filter(r -> r.getValue() >= minValue)
                .filter(or -> or.getValue() <= maxValue)
                .toList();
    }


    public int getSize() {
        return this.orderList.size();
    }


    //zsumowanie wartości wszystkich zamówień.
    public double sumOrders() {
        return orderList
                .stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
//        double sum = 0;
//        for (Order order : this.orderList) {
//            sum += order.getValue();
//        }
//        return sum;

    public Set<String> getAllUsers(){
        return orderList
                .stream()
                .map(Order::getLogin)
                .collect(Collectors.toSet());
    }

    //Wyczyszczenie listy
    public void clear() {
        this.orderList.clear();
    }

    public Set<Order> getOrderList() {
        return orderList;
    }
}