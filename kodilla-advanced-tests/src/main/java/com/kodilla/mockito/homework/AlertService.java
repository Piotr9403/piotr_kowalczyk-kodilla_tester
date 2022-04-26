package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;

public class AlertService {
    private Map<Location, List<Person>> locations = new HashMap<>();

    private Notifier notifier;

    public AlertService(Notifier notifier) {
        this.notifier = notifier;
    }

    public Map<Location, List<Person>> getLocations() {
        return locations;
    }

    //method add location
    public void addLocation(Location location) {
        System.out.println("Dodanie lokacji:  " + location);
        locations.put(location, new ArrayList<>());
    }
    //method remove location
    public void removeLocation(Location location) {
        System.out.println("Usunięcie lokacji:  " + location + " from the system.");
        locations.remove(location, new ArrayList<>());
    }

    //method add Subscriber
    public void addSubscriber(Person person, Location location) {
        List<Person> personList = locations.get(location);
        personList.add(person);
    }
    //method add Remove Subscriber from location
    public void removeSubscriberFromLocation(Person person, Location location) {
        List<Person> personList = locations.get(location);
        personList.remove(person);
    }

    //method add Remove Subscriber from all location
    public void removeSubscriberFromAllLocations(Person person) {
        locations.values()
                .forEach(list -> list.remove(person));

    }
    //send notification to location
    public void sendNotificationToLocation(Location location, String message) {
        List<Person> personList = locations.get(location);
        personList.forEach(p -> notifier.notify(p,message));
    }
    //send notification to all
    public void sendNotificationToAll(String message) {
        Set<Person> person = locations.entrySet()
                .stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toSet());
        person.forEach(p -> notifier.notify(p,message));

    }

}