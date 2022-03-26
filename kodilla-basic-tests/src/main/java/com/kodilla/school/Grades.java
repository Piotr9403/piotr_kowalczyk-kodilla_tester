package com.kodilla.school;

public class Grades {
    private int[] values;
    private int size;

    public Grades() {
        this.size = 0;
        this.values = new int[0];
    }
    // add(int value) najpierw inkrementujemy (zwiększamy o jeden) wartość size
    public void add(int value) {
        this.size++;
        // tworzymy pustą tablicę z nowym rozmiarem
        int[] newTab = new int[this.size];
        // metoda System: System.arraycopy(values, 0, newTab, 0, values.length);.
        // Pozwala ona na skopiowanie tablicy źródłowej do tablicy docelowej, zachowując obecny układ elementów.
        System.arraycopy(values, 0, newTab, 0, values.length);
        // przypisujemy nową wartość do ostatniego elementu w tablicy
        // (konieczne było odjęcie cyfry jeden od rozmiaru tablicy, indeksy liczymy od zera)
        newTab[this.size - 1] = value;
        // Ostatnia linia to przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie.
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }
    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }
}