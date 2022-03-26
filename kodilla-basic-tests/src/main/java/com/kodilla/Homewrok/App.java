package com.kodilla.Homewrok;

class App {
    public static void main(String[] args) {
        CashMachine c1 = new CashMachine();
        c1.add(100);
        c1.add(-50);
        c1.add(200);
        c1.add(-20);
        CashMachine c2 = new CashMachine();
        c2.add(500);
        c2.add(-100);
        c2.add(-100);
        c2.add(20);
        Bank bank = new Bank();
        bank.addCashMachine(c1);
        bank.addCashMachine(c2);
        System.out.println("Bankomat C1:");
        System.out.println("Avg deposits: " + c1.getAverageDeposits());
        System.out.println("Num of deposits: " + c1.getNumberOfDeposits());
        System.out.println("Avg withdrawals: " + c1.getAverageWithdrawal());
        System.out.println("Num of withdrawals: " + c1.getNumberOfWithdrawals());
        System.out.println("Sum: " + c1.getSumOfTransactions());

        System.out.println("Bank:");
        System.out.println("Avg deposits: " + bank.getAverageDepositsFromCashMachines());
        System.out.println("Avg withdravals: " + bank.getAverageWithdrawalFromCashMachines());
        System.out.println("Num of withdravals: " + bank.getNumberOfWithdrawalsFromCashMachines());
        System.out.println("Num of deposits: " + bank.getNumberOfDepositsFromCashMachines());
        System.out.println("Sum: " + bank.getSumOfTransactionsFromCashMachines());
    }
}