package com.kodilla.color;

import com.kodilla.color.UserColorApp;
import com.kodilla.petle.User;

public class UserColor {
    public static void main(String args[]) {
        //gdy nie ma static method trzeba zadaklarowac klase
        //UserColorApp userApp = new UserColorApp();      //instacja klasy
        //userApp.getUserWord();                       //wprowadza litere z klasy wpisaną z konsoli getUserWord

        //dzieki static method mozna uzyc metody z klasy
        UserColorApp.getUserWord();
        //System.out.println(userApp);        // wyświetla strumień zadekarowany do danej litery ze switch(choice)

    }
}