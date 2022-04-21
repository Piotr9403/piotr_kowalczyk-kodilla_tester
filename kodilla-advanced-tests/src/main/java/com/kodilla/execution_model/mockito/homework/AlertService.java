package com.kodilla.execution_model.mockito.homework;

import java.util.*;

public class AlertService {

    private Map<Location, List<Person>> locations = new HashMap<>();

    //method add location
    public void addLocation(Location location) {
        System.out.println("Dodanie lokacji:  " + location);
        locations.put(location, new ArrayList<Person>());
        //this.locations.add(location); - próbowałem to zerbić na Set
    }

    //method remove location
    public void removeLocation(Location location) {
        System.out.println("Usunięcie lokacji:  " + location + " from the system.");

    }

    public void addSubscriber(Person person, Location location) {

    }

    public void removeSubscriberFromLocation(Person person, Location location) {

    }

    public void removeSubscriberFromAllLocations(Person person) {

    }

    public void sendNotificationToLocation(WeatherNotification weatherNotification, Location location) {

    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {

    }


}
