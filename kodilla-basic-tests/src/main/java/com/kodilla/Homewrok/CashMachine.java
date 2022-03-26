package com.kodilla.Homewrok;
class CashMachine {
    private int[] transaction;
    private int sizeTransaction;

    public CashMachine() {
        this.sizeTransaction = 0;
        this.transaction = new int[0];

    }

    public void add(int value) {
        this.sizeTransaction++;
        int[] newTab = new int[this.sizeTransaction];
        System.arraycopy(transaction, 0, newTab, 0, transaction.length);
        newTab[this.sizeTransaction - 1] = value;
        this.transaction = newTab;
    }

    //suma transakcji
    public int getSumOfTransactions() {
        int sum = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            sum += this.transaction[i];
        }
        return sum;
    }

    //metoda zwracająca ilość transakcji wypłat
    public int getNumberOfWithdrawals() {
        int sum = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            if (this.transaction[i] < 0) {
                sum++;
            }
        }
        return sum;
    }

    //metoda zwracająca średnią wypłatę
    public int getAverageWithdrawal() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            if (this.transaction[i] < 0) {
                sum += this.transaction[i];
                count++;
            }
        }
        return sum / count;
    }

    //metoda zwracająca średnią wpłat
    public int getAverageDeposits() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < transaction.length; i++) {
            if (this.transaction[i] > 0) {
                sum += this.transaction[i];
                count++;
            }
        }
        return sum / count;
    }

    //suma zwracająca  wpłaty
    public int getNumberOfDeposits() {
        int counter = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            if (this.transaction[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
}