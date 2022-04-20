package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order pizza = new Order(50.50, LocalDate.of(2005, 12, 25), "Peter");
    Order kebab = new Order(10.70, LocalDate.of(2012, 10, 1), "Bartosz");
    Order burger = new Order(4.50, LocalDate.of(2020, 9, 5), "Johnson");
    Order spaghetti = new Order(15.4, LocalDate.of(2019, 7, 15), "Benek");
    Order nachos = new Order(21.15, LocalDate.of(2015, 1, 20), "Major");
    Order lazanne = new Order(20.75, LocalDate.of(2018, 2, 15), "Wojtek");
    Order soup = new Order(7.50, LocalDate.of(2019, 4, 7), "Bogdan");


    @Test
    public void shouldAddItemsToInvoice() {
        //When
        int numberOfOrders = shop.getSize();

        //Then
        assertEquals(7, numberOfOrders);
    }

    @Test
    public void shouldAddOrdersToOrderList() {
        //Then
        assertEquals(7, shop.orderList.size());
        System.out.println("Test: " + shop.orderList.size());
    }

    @Test
    public void shouldReturnTheListOfOrdersWhenMinAndMaxAreBothCorrect() {
        //Then
        assertEquals(6, shop.getOrderListBasedOnTheMinAndMaxValue(0, 30).size());
        System.out.println("The list: " + shop.orderList);
    }

//    @Test
//    public void shouldReturnTheListOfOrdersWhenDatesAreCorrect() {
//        //Then
//        assertEquals(6,shop.getOrderListBasedOnTheRangeOfTwoDates(LocalDate.of(2005,12,25),
//                LocalDate.of(2020,9,5)).size());
//    }

    // Suma wartości ze zleceń
    @Test
    public void shouldReturnTotalValueOfAllOrders() {
        //Then
        assertEquals(130.50, shop.sumOrders());
        System.out.println("The sum of the value of all orders: " + shop.sumOrders());
    }

    //Czyszczenie tablicy
    @Test
    public void shouldClearInvoice() {
        //When
        shop.clear();

        //Then
        assertEquals(0, shop.getSize());
        System.out.println("The quantity of items in the list is: " + shop.getSize());
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(pizza);
        shop.addOrder(kebab);
        shop.addOrder(burger);
        shop.addOrder(spaghetti);
        shop.addOrder(nachos);
        shop.addOrder(lazanne);
        shop.addOrder(soup);
    }
}
