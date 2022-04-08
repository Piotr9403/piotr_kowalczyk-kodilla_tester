package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure){

        List<Flight> flightsDeparture = new ArrayList<>();
        for(Flight searchedFlight : FlightRepository.getFlightsTable()){
            if(searchedFlight.getDeparture().equals(departure)){
                flightsDeparture.add(searchedFlight);
            }
        }
        return flightsDeparture;

    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsDeparture = new ArrayList<>();
        for(Flight searchedFlight : FlightRepository.getFlightsTable()){
            if(searchedFlight.getArrival().equals(arrival)){
                flightsDeparture.add(searchedFlight);
            }
        }
        return flightsDeparture;

    }
}