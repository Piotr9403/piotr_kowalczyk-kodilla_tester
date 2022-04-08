package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class FlightFinderTestSuite {

    @Test
    public void testFindFlightsToBER() {

        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("BER");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("WAW", "BER"));
        assertEquals(expectedList, foundFlights);
    }

    @Test
    public void testFindFlightsToPAR() {

        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("PAR");
        //then
        List<Flight> expectedList = new ArrayList<>();;
        expectedList.add(new Flight("WAW", "PAR"));
        assertEquals(expectedList, foundFlights);
    }

    @Test
    public void testFindFlightsFromWAW() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsFrom("WAW");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("WAW", "BER"));
        expectedList.add(new Flight("WAW", "PAR"));
        expectedList.add(new Flight("WAW", "MIN"));
        expectedList.add(new Flight("WAW", "KIJ"));
        expectedList.add(new Flight("WAW", "LA"));
        expectedList.add(new Flight("WAW", "NY"));
        assertEquals(expectedList, foundFlights);
    }

    @Test
    public void testFindFlightsFromKIJ() {

        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("WAW");
        //then
        List<Flight> expectedList = new ArrayList<>();;
        expectedList.add(new Flight("KIJ", "WAW"));
        assertNotEquals(expectedList, foundFlights);
    }
    @Test
    public void testFindFlightsFromMIN() {

        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("WAW");
        //then
        List<Flight> expectedList = new ArrayList<>();;
        expectedList.add(new Flight("MIN", "WAW"));
        assertNotEquals(expectedList, foundFlights);
    }
    @Test
    public void testFindFlightsFromLA() {

        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("WAW");
        //then
        List<Flight> expectedList = new ArrayList<>();;
        expectedList.add(new Flight("LA", "WAW"));
        assertNotEquals(expectedList, foundFlights);
    }
    @Test
    public void testFindFlightsFromNY() {

        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFlightsTo("WAW");
        //then
        List<Flight> expectedList = new ArrayList<>();;
        expectedList.add(new Flight("NY", "WAW"));
        assertNotEquals(expectedList, foundFlights);
    }

}