package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("WAW", "BER"));
        flights.add(new Flight("WAW", "PAR"));
        flights.add(new Flight("WAW", "MIN"));
        flights.add(new Flight("WAW", "KIJ"));
        flights.add(new Flight("WAW", "LA"));
        flights.add(new Flight("WAW", "NY"));
        flights.add(new Flight("BER", "WAW"));
        flights.add(new Flight("PAR", "WAW"));

        return flights;
    }
}
