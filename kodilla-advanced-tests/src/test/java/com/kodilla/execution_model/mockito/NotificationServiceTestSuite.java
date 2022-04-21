package com.kodilla.execution_model.mockito;

import com.kodilla.mockito.notification.Client;
import com.kodilla.mockito.notification.Notification;
import com.kodilla.mockito.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(secondClient);
        notificationService.addSubscriber(thirdClient);


        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);

    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        NotificationService notificationService = new NotificationService();
        Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }
}