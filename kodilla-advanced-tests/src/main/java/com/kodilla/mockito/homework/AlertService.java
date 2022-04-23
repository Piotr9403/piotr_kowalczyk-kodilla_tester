package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;

public class AlertService {

    private Map<Location, List<Person>> locations = new HashMap<>();
    private Notifier notifier;

    public AlertService(Notifier notifier) {
        this.notifier = notifier;
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

    public void addSubscriber(Person person, Location location) {
        List<Person> personList = locations.get(location);
        personList.add(person);
    }

    public void removeSubscriberFromLocation(Person person, Location location) {
        List<Person> personList = locations.get(location);
        personList.remove(person);
    }

    public void removeSubscriberFromAllLocations(String person) {
        locations.values()
                .forEach(list -> list.remove(person));

    }

    public void sendNotificationToLocation(Location location, String message) {
        List<Person> personList = locations.get(location);
        personList.forEach(p -> notifier.notify(p,message));
    }

    public void sendNotificationToAll(String message) {
        Set<Person> person = locations.entrySet()
                .stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toSet());
        person.forEach(p -> notifier.notify(p,message));

    }


}
