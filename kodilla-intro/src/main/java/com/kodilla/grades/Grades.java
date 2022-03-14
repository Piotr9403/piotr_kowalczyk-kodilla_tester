package com.kodilla.grades;

public class Grades {

    private int[] grades;               // tablica o nazwie grades o klasie intów
    private int size;


    public Grades() {                   //konstruktor
        this.grades = new int[10];      //inicjacja pustej tablicy o rozmiarze 10
        this.size = 0;


    }

    //metoda która dodaje do tablicy, metoda "add" dodaje jako parametr jako ocene
    public void add(int grade) {
        if (size == 10) {
            return;
        }
        grades[this.size] = grade;
        size++;                     //zwiększamy licznik o 1
    }

    public int getLastGrade() {
        if (size == 0) {
            return -1;
        }
        return grades[size - 1];
    }

    public double getAverage() {
        if (size ==0){
            return -1;
        }
        double sum = 0;                     //zmienna double
        for (int n = 0; n < size; n++) {    //w petli od 0 do size -1
            sum += grades[n];
        }
        return sum / size;                  //zwraca sum dzielone przez 0
    }
}





