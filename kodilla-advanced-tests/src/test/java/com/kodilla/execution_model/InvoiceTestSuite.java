package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    //Dodanie nowych pozycji (Item) i sprawdzenie, czy rozmiar listy się zmienia.
    @Test
    public void shouldAddItemsToInvoice(){
        //Given

        //When
        int numberOfItems = invoice.getSize();
        //Then
        assertEquals(3, numberOfItems);
    }

    //Dodanie kilku pozycji, pobranie jednej z nich, sprawdzenie,
    // czy wartości nazwy i ceny są zgodne z wartościami oczekiwanymi.
    @Test
    public void shouldGetExistingItem() {
        //Given

        //When
        Item result = invoice.getItem(2);
        //Then
        assertEquals("Bread", result.getName());
        assertEquals(4.15, result.getPrice(), 0.01);
    }

    //Pobranie elementu o ujemnym indeksie – oczekiwany wynik to null.
    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //Given

        //When
        Item result = invoice.getItem(-3);
        //Then
        assertNull(result);
    }

    //Pobranie elementu o spoza listy (duży indeks), oczekiwany wynik to null.
    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //Given
        //When
        Item result = invoice.getItem(7);
        //Then
        assertNull(result);
    }

    //Wyczyszczenie faktury i sprawdzenie, czy rozmiar listy wynosi 0.
    @Test
    public void shouldClearInvoice() {
        //Given
        //When
        invoice.clear();
        //Then
        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
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


}