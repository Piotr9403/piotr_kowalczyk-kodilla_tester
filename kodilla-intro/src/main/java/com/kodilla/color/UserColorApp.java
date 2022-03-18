package com.kodilla.color;

import java.util.Scanner;

public class UserColorApp {

    public static void getUserWord() {
        Scanner scanner = new Scanner(System.in);
        while (true) {                                   //pętla będzie powtarzała wybór pierwszej litery
            System.out.println("Wybierz litere: I , B , G , Y , O , R");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'V':
                    System.out.println("Violet");
                    break;

                case 'I':
                    System.out.println("Indigo");
                    break;

                case 'B':
                    System.out.println("Blue");
                    break;

                case 'G':
                    System.out.println("Green");
                    break;

                case 'Y':
                    System.out.println("Yellow");
                    break;

                case 'O':
                    System.out.println("Orange");
                    break;

                case 'R':
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
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter first word ");
                String word = scanner.nextLine().trim();
                if (word.length() >= 1) {
                    return word;
                }
                System.out.println("Wrong word ");
            }
        }
    }
}