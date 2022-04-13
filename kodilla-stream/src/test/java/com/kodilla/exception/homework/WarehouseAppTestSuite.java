package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Warehouse.addOrder(new Order("2"));
        Warehouse.getOrder("2");
        //then
        Order expectedOrder = new Order("2");
        assertEquals(expectedOrder.getNumber(), Warehouse.getOrder("2").getNumber());
    }

    @Test
    public void testGetOrder_withException(){
        //given
        Warehouse warehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder("7"));
    }
}