package com.kodilla.execution_model.mockito;

import com.kodilla.mockito.MobilePhone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MobilePhoneTestSuite {

    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        //testujemy domyśle zachowanie. Następnie sterujemy działaniem metody needsCharging()
        Assertions.assertFalse(myPhone.needsCharging());
        //"jeśli zostanie wywołana metoda needsCharging() z obiektu o nazwie myPhone, zwróć true jako wynik działania tej metody"
        //Spradzanie czy sekcja when().thenReturn() zadziałała poprawnie
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }

    @Test
    public void shouldCallLaunchApplication() {
        myPhone.launchApplication("Tetris4D");
        Mockito.verify(myPhone).launchApplication("Tetris4D");
    }
   /* @Test
    public void testVerificationFailure() {
        myPhone.needsCharging();
        Mockito.verify(myPhone).getFreeStorage();
    }
    */
}