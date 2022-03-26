package com.kodilla.Homewrok;

class Bank {

    private int numberOfCashMachines;
    //tablica zmiennej CashMachine , nazwa zmiennej cashMachines
    private CashMachine[] cashMachines;

    public Bank() {
        numberOfCashMachines = 0;
        cashMachines = new CashMachine[0];
    }
    //metoda ma dodać nowy bankomat, dodaje liczbę bankomatów
    //jako parametr dostaje cashMachine(bankomat)
    public void addCashMachine(CashMachine cashMachine){
        //zwiększa liczbę bankomatów
        numberOfCashMachines++;
        //tworzenie nowej tablicy
        CashMachine[] newTab = new CashMachine[numberOfCashMachines];
        //kopiowanie starej tablicy do nowej
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        //kopiowanie starej tablicy do nowej
        newTab[numberOfCashMachines - 1] = cashMachine;
        //wkładamy do nowej tablicy do ostatniej pozycji
        //dopisujemy nową tablice do pola cashMachine po to aby zawierała jedną pozycję więcej
        cashMachines = newTab;
    }

    public int getSumOfTransactionsFromCashMachines(){
        int sum = 0;
        for (int n = 0; n < cashMachines.length; n++) {
            sum += cashMachines[n].getSumOfTransactions();
        }
        return sum;
    }

    public int getNumberOfWithdrawalsFromCashMachines(){
        int counter = 0;
        for (int n = 0; n < cashMachines.length; n++) {
            counter += cashMachines[n].getNumberOfWithdrawals();
        }
        return counter;
    }

    public int getNumberOfDepositsFromCashMachines(){
        int counter = 0;
        for (int n = 0; n < cashMachines.length; n++) {
            counter += cashMachines[n].getNumberOfDeposits();
        }
        return counter;
    }

    public double getAverageWithdrawalFromCashMachines(){
        double sum = 0;
        for (int n = 0; n < cashMachines.length; n++) {
            sum += cashMachines[n].getAverageWithdrawal();
        }
        return sum / cashMachines.length;
    }

    public double getAverageDepositsFromCashMachines(){
        double sum = 0;
        for (int n = 0; n < cashMachines.length; n++) {
            sum += cashMachines[n].getAverageDeposits();
        }
        return sum / cashMachines.length;
    }
}