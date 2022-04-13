package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Warehouse.addOrder(new Order("5"));
        Warehouse.getOrder("5");
        //then
        Order expectedOrder = new Order("5");
        assertEquals(expectedOrder.getNumber(), Warehouse.getOrder("5").getNumber());

    }

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Warehouse.addOrder(new Order("5"));
        Warehouse.getOrder("5");
        //then
        assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder("6"));
    }

}