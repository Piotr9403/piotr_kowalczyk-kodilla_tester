package com.kodilla.basic_assertion;

public class ResultChecker {

    /*W niej dodajmy statyczną metodę assertEquals. Będzie ona przyjmowała dwa argumenty typu int:
    jeden zawierający wynik zwracany przez metody kalkulatora, a drugi z wynikiem oczekiwanym.
    Jak możesz się domyślać, metoda będzie sprawdzać, czy otrzymany wynik jest taki sam, jak oczekiwany.
    Będzie ona zwracać wynik typu boolean – true jeśli liczby są równe, false w przeciwnym wypadku:
     */
    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }
}