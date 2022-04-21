package com.kodilla.execution_model.mockito.homework;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AlertServiceTestSuite {

    AlertService weatherAlert = new AlertService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    @Test
    public void shouldAddLocation() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlert.addLocation(locationTwo);
        weatherAlert.addSubscriber(person, locationTwo);
        Mockito.verify(locationTwo, Mockito.times(1)).addSubscriber(person);
    }



}