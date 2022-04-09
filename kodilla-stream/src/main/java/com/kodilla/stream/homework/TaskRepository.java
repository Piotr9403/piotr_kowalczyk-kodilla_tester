package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        LocalDate myDate = LocalDate.of(2022, 7, 10);
        LocalDate localDate = LocalDate.of(2022,4,8);

        tasks.add(new Task("Posprzątanie domu ",localDate,myDate));

        return tasks;
    }
}
