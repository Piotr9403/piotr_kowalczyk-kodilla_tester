package com.kodilla.grades;

public class App {
    public static void main(String[] args){         //tworzymy metode main
        Grades grades = new Grades();               //tworzymy obiekt klasy Grades
        grades.add(4);                              //wywołanie metody add
        grades.add(5);
        grades.add(5);
        grades.add(3);

        int lastGrade = grades.getLastGrade();    //wyświetla sie na czerwono wtedy kiedy jeszcze nie stworzyliśmy metody
        System.out.println(lastGrade);

        double average = grades.getAverage();
        System.out.println(average);

    }
}
