package com.kodilla.color;

import java.util.Scanner;

public class UserColorApp {

    public static void getUserWord() {
        while (true) {                                   //pętla będzie powtarzała wybór pierwszej litery
            String choice = UserDialogs.getWord();
            switch (choice) {
                case "V":
                    System.out.println("Violet");
                    break;

                case "I":
                    System.out.println("Indigo");
                    break;

                case "B":
                    System.out.println("Blue");
                    break;

                case "G":
                    System.out.println("Green");
                    break;

                case "Y":
                    System.out.println("Yellow");
                    break;

                case "O":
                    System.out.println("Orange");
                    break;

                case "R":
                    System.out.println("Red");
                    break;

                //jeżeli wybierze sie liczbę nie z przedziału to wyświetla komunikat
                default:
                    System.out.println("Wybierz literę z przedziału");
            }
        }

    }

    public class UserDialogs {
        public static String getWord() {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wybierz litere: I , B , G , Y , O , R");
                String word = scanner.nextLine().trim();
                if (word.length() >= 1) {
                    return word;
                }
            }
        }
    }
}