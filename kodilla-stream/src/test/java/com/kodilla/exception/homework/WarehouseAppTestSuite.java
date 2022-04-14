package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.addOrder(new Order("5"));
        warehouse.getOrder("5");
        //then
        Order expectedOrder = new Order("5");
        assertEquals(expectedOrder.getNumber(), warehouse.getOrder("5").getNumber());

    }

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.addOrder(new Order("5"));
        warehouse.getOrder("5");
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("6"));
    }

    @Test
    public void testGetOrder_2() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.addOrder(new Order("6"));
        warehouse.getOrder("6");
        //then
        Order expectedOrder = new Order("5");
        assertNotEquals(expectedOrder.getNumber(), warehouse.getOrder("6").getNumber());

    }
}