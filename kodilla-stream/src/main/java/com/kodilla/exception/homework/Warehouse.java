package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    static List<Order> orders = new ArrayList<>();

    public List<Order> getOrderList() {
        return orders;
    }

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {

        Order orderNumber = orders.stream()
                .filter(n -> n.getNumber().equals(number))
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException());

        return orderNumber;
    }
}