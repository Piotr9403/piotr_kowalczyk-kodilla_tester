package com.kodilla.color;

import java.util.Scanner;

public class UserColorApp {
    public static void getUserWord() {
        // pole logiczne do kontroli petli while
        boolean flag = true;
        while (flag) {                                   //pętla będzie powtarzała wybór pierwszej litery
            System.out.println("Wybierz litere: I , B , G , Y , O , R");
            System.out.println("Wyjscie z programu: e");
            String choice = getWord();
            switch (choice) {
                case "V" -> System.out.println("Violet");
                case "I" -> System.out.println("Indigo");
                case "B" -> System.out.println("Blue");
                case "G" -> System.out.println("Green");
                case "Y" -> System.out.println("Yellow");
                case "O" -> System.out.println("Orange");
                case "R" -> System.out.println("Red");
                case "e" -> flag = false; // wyjscie z petli


                //jeżeli wybierze sie liczbę nie z przedziału to wyświetla komunikat
                default -> System.out.println("Wybierz literę z przedziału");
            }
        }

    }

        public static String getWord() {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                String word = scanner.nextLine().trim();
                if (word.length() >= 1) {
                    return word;
                }
            }
        }
}