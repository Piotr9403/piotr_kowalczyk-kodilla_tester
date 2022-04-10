package com.kodilla.stream.user;

public class UsersManager {
    public static void main(String[] args) {
        UsersRepository.getUsersList()                   // [1]
                .stream()                                // [2]
                .map(u -> u.getUsername())               // [3]
                .forEach(un -> System.out.println(un));  // [4]

    }
}

/*
W linii [1] wywołujemy metodę, która zwraca nam ArrayList obiektów typu User.
W linii [2] uruchamiamy strumień (IntelliJ podpowiada po prawej stronie, że
wynikiem działania tej linii jest Stream, przez który przepływają obiekty typu User).
Linia [3] to pierwsza operacja transformująca. Metoda map klasy Stream pozwala nam modyfikować obiekty przepływające
przez strumień.
Argumentem tej metody jest tzw. wyrażenie lambda. O szczegółach tej konstrukcji za chwilę powiemy więcej.
Na razie niech wystarczy informacja, że wyrażenie lambda jest "funkcją", przez którą "przepuszczamy" obiekty.
Po lewej stronie strzałki znajdują się zmienne reprezentujące argumenty wejściowe funkcji
(tu mamy zmienną u – nazwa jest tak naprawdę dowolna – do której będą wpadały kolejne obiekty klasy User),
po prawej stronie natomiast znajduje się kod zwracający obiekty wynikowe (tu mamy wywołanie gettera getUsername().
Widać więc, że wynikiem działania tej funkcji będą obiekty typu String zawierające nazwę użytkownika).
IntelliJ ponownie nam podpowiada, że wynikiem tej linii będzie strumień Stream obiektów typu String.
Linia [4] to wyrażenie terminalne (kolektor). Metoda forEach klasy Stream jest kolektorem, który
wykonuje daną operację na każdym obiekcie, przepływającym kolejno przez strumień. Kolektor "konsumuje"
obiekty ze strumienia, nie przekazując ich już dalej, i kończy Stream. Operacja, która ma być wykonana na
obiektach ze strumienia, ponownie podawana jest jako wyrażenie lambda, czyli funkcja. Na wejściu
(z lewej strony strzałki) otrzymuje ona String z nazwą użytkownika (użyliśmy tu zmiennej o nazwie un), a w
swym wnętrzu wywołuje System.out.println na tej zmiennej (z prawej strony strzałki), co powoduje wyświetlenie obiektów
na ekranie.
 */