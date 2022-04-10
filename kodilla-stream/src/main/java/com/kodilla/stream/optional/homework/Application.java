package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Marek , ", null));
        studentList.add(new Student("Wojtek , ", null));
        studentList.add(new Student("Mikołaj , ", new Teacher("Mariusz")));
        studentList.add(new Student("Arek , ", new Teacher("Antoni")));
        studentList.add(new Student("Mateusz , ", new Teacher("Maria")));

        for (Student students : studentList) {
            Teacher teacher = Optional.ofNullable(students.getTeacher()).orElse(new Teacher("undefined"));
            Optional<Teacher> optionalTeacher = Optional.ofNullable(students.teacher);
            optionalTeacher.ifPresentOrElse(
                    u -> System.out.println("Student: " + students.getName() + "Teacher: " +
                            teacher.getName()),
                    () -> System.out.println("Student: " + students.getName() + "Teacher: " +
                            teacher.getName()));
        }
    }
}