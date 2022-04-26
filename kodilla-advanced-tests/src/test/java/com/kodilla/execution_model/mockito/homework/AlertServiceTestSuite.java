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
    void setup() {
        notifierMock = mock(Notifier.class);
        weatherAlert = new AlertService(notifierMock);

        Location chicago = new Location("Chicago");
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
        weatherAlert.addSubscriber(walter, orlando);
    }


    @Test
    void shouldSendNotificationsToALL() {
        //when
        weatherAlert.sendNotificationToAll("Test alert");
        //then
        verify(notifierMock, times(3)).notify(any(), any());
    }

    @Test
    void shouldSendNotificationsToLocation() {
        //when
        weatherAlert.sendNotificationToLocation(new Location("Miami"), "Test alert");
        //then
        verify(notifierMock, times(1)).notify(new Person("John"), "Test alert");
        verify(notifierMock, times(1)).notify(new Person("Jessica"), "Test alert");
        verify(notifierMock, times(0)).notify(new Person("Walter"), "Test alert");
    }

    @Test
    void shouldRemoveSubscriberFromAllLocations() {
        //when
        weatherAlert.removeSubscriberFromAllLocations(new Person("John"));
        //then
        Assertions.assertTrue(weatherAlert.getLocations()
                .values()
                .stream()
                .flatMap(c -> c.stream())
                .filter(p -> p.equals(new Person("John")))
                .findAny()
                .isEmpty());
    }

    @Test
    void shouldRemoveSubscriberFromLocation() {
        //when
        weatherAlert.removeSubscriberFromLocation(new Person("John"), new Location("Miami"));
        //then
        Assertions.assertEquals(1,weatherAlert.getLocations()
                .values()
                .stream()
                .flatMap(c -> c.stream())
                .filter(p -> p.equals(new Person("John")))
                .count());
    }

    @Test
    void shouldAddSubscriberAndLocation() {
        //given
        Person chris = new Person("Chris");
        Location paloALto = new Location("Palo ALto");
        //when
        weatherAlert.addLocation(paloALto);
        weatherAlert.addSubscriber(chris,paloALto);
        //then
        Assertions.assertEquals(1,weatherAlert.getLocations()
                .keySet()
                .stream()
                .filter(l -> l.equals(paloALto))
                .count());
        Assertions.assertEquals(1,weatherAlert.getLocations()
                .values()
                .stream()
                .flatMap(c -> c.stream())
                .filter(p -> p.equals(chris))
                .count());
    }

    @Test
    void shouldRemoveLocation() {
        //given
        Location paloALto = new Location("Palo ALto");
        weatherAlert.addLocation(paloALto);
        //when
        weatherAlert.removeLocation( paloALto);
        //then
        Assertions.assertEquals(0,weatherAlert.getLocations()
                .keySet()
                .stream()
                .filter(l -> l.equals(paloALto))
                .count());

    }

}