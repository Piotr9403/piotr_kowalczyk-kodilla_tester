package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private Shop shop = new Shop();

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
        shop.addOrder(new Order(50.50, LocalDate.of(2005, 12, 25), "Peter"));
        shop.addOrder(new Order(10.70, LocalDate.of(2012, 10, 1), "Bartosz"));
        shop.addOrder(new Order(4.50, LocalDate.of(2020, 9, 5), "Johnson"));
        shop.addOrder(new Order(15.4, LocalDate.of(2019, 7, 15), "Benek"));
        shop.addOrder(new Order(21.15, LocalDate.of(2015, 1, 20), "Major"));
        shop.addOrder(new Order(20.75, LocalDate.of(2018, 2, 15), "Wojtek"));
        shop.addOrder(new Order(7.50, LocalDate.of(2019, 4, 7), "Peter"));
    }

    @Test
    void shouldReturnAllUsers(){
        //Then
        assertEquals(6, shop.getAllUsers().size());
        System.out.println("Users: " + shop.getAllUsers().size());
    }

    @Test
    void shouldAddItemsToInvoice() {
        //When
        int numberOfOrders = shop.getSize();

        //Then
        assertEquals(7, numberOfOrders);
    }

    @Test
    void shouldAddOrdersToOrderList() {
        //Then
        assertEquals(7, shop.getSize());
        System.out.println("Test: " + shop.getSize());
    }

    @Test
    void shouldReturnTheListOfOrdersWhenMinAndMaxAreBothCorrect() {
        //Then
        assertEquals(6, shop.getOrderListBasedOnTheMinAndMaxValue(0, 30).size());
        System.out.println("The list: " + shop.getOrderListBasedOnTheMinAndMaxValue(0, 30).size());
    }

    @Test
    void shouldReturnTheListOfOrdersWhenDatesAreCorrect() {
        //Then
        assertEquals(5,shop.getOrderListBasedOnTheRangeOfTwoDates(LocalDate.of(2005,12,25),
                LocalDate.of(2020,9,5)).size());
    }
    // Suma wartości ze zleceń

    @Test
    void shouldReturnTotalValueOfAllOrders() {
        //Then
        assertEquals(130.50, shop.sumOrders());
        System.out.println("The sum of the value of all orders: " + shop.sumOrders());
    }
    //Czyszczenie tablicy

    @Test
    void shouldClearInvoice() {
        //When
        shop.clear();

        //Then
        assertEquals(0, shop.getSize());
        System.out.println("The quantity of items in the list is: " + shop.getSize());
    }
}
