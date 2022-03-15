package com.kodilla.refactoring;

public class Application {
    public static void main(String[] args){
        User user = new User("Adam", 40.5,  178);
        System.out.println(User.name+ " " + User.age + " " + User.height);
        User.Info();

    }
}
