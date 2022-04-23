package com.kodilla.execution_model.mockito.homework;

import com.kodilla.mockito.homework.AlertService;
import com.kodilla.mockito.homework.Location;
import com.kodilla.mockito.homework.Notifier;
import com.kodilla.mockito.homework.Person;
import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

class AlertServiceTestSuite {

    private Notifier notifierMock;
    private AlertService weatherAlert;

    @BeforeAll
    public static void initiateTesting() {
        System.out.println("Beginning testing.");
    }

    @BeforeEach
    public void initializeTest() {
        System.out.println("Running test...");
    }

    @AfterEach
    public void endTest() {
        System.out.println("-----");
    }

    @AfterAll
    public static void closeTesting() {
        System.out.println("Ending testing.");
    }

    @BeforeEach
    void setup(){
        notifierMock = mock(Notifier.class);
        weatherAlert = new AlertService(notifierMock);

        Location chicago = new Location("Cicago");
        Location miami = new Location("Miami");
        Location orlando = new Location("Orlando");

        Person john = new Person("John");
        Person jessica = new Person("Jessica");
        Person walter = new Person("Walter");

        weatherAlert.addLocation(chicago);
        weatherAlert.addLocation(miami);
        weatherAlert.addLocation(orlando);
        weatherAlert.addSubscriber(john, chicago);
        weatherAlert.addSubscriber(john, miami);
        weatherAlert.addSubscriber(jessica, miami);
        weatherAlert.addSubscriber(walter , orlando);
    }


    @Test
    void shouldSendNotificationsToALL() {
        //when
        weatherAlert.sendNotificationToAll("Test alert");
        //then
        verify(notifierMock, times(3)).notify(any(), any());
    }


    @Test
    void shouldRemoveSubscriberFromAllLocations() {
        //when
        weatherAlert.removeSubscriberFromAllLocations();
        //then
        verify(notifierMock, times(3)).notify(any(), any());
    }

//    @Test
//    void shouldRemoveSubscriberFromLocation() {
//        //when
//        weatherAlert.removeSubscriberFromLocation();
//        //then
//        verify();
//    }

//    @Test
//    void shouldRemovelocation() {
//        //when
//        weatherAlert.removeLocation();
//        //then
//
//    }




}