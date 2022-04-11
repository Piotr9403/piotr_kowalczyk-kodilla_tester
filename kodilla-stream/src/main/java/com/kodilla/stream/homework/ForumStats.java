package com.kodilla.stream.homework;

import com.kodilla.stream.user.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostsAbove40 = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        System.out.println("Średnia postów powyżej 40 roku życia: " + avgPostsAbove40);

        double avgPostsbelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        System.out.println("Średnia postów poniżej 40 roku życia: " + avgPostsbelow40);
    }
}