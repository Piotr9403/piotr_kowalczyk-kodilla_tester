package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

    /* obiekt typu Calculator wraz z dwiema przykładowymi liczbowymi zmiennymi, na
    których przetestujemy działanie metody:
     */
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        // Wywołać wspomnianą metodę sum(int a, int b) i wynik przypisać do nowej zmiennej

        int sumResult = calculator.sum(a, b);

    /*czy otrzymany wynik jest zgodny z oczekiwanym. Do tego posłuży nam metoda assertEquals z klasy ResultChecker.
    Zwraca ona wartość boolean, którą możemy przypisać do zmiennej.
     */

        boolean correct = ResultChecker.assertEquals(13, sumResult);

        //wyrażenie warunkowe, które wyświetli tekst informujący o poprawności działania metody sumującej dwie liczby.

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator2 = new Calculator();
        int c = 4;
        int sqrtResult = calculator2.sqrt(c);

        boolean correct2 = ResultChecker.assertEquals(16, sqrtResult);

        if (correct2) {
            System.out.println("Metoda sqrt działa poprawnie dla liczb " + c);
        } else {
            System.out.println("Metoda sqrt nie działa poprawnie dla liczb " + c);
        }

    }

}
