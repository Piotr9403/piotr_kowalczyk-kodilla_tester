package com.kodilla.color;

import java.util.Scanner;

public class UserColorApp {

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

        public static String getUserWord

        {
            Scanner scanner = new Scanner();
            while (true) {
                System.out.println("VIBGYOR Spectrum");
                System.out.println("Wybrany kolor to: ");
                String choice = in.next().charAt(0);
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

                    default:
                        System.out.println("Incorrect choice");
                }
            }
        }

    }