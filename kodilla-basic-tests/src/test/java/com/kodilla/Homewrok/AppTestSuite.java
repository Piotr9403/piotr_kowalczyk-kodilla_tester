package com.kodilla.Homewrok;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    private Bank bank;

    @BeforeEach
    void prepareTestData() {
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
        bank = new Bank();
        bank.addCashMachine(c1);
        bank.addCashMachine(c2);
    }

    @Test
    void testSumOfTransactions() {
        // when
        int result = bank.getSumOfTransactionsFromCashMachines();
        // then
        assertEquals(550, result);
    }

    @Test
    void testNumOfDeposits() {
        // when
        int result = bank.getNumberOfDepositsFromCashMachines();
        // then
        assertEquals(4, result);
    }

    @Test
    void testNumOfWithdrawals() {
        // when
        int result = bank.getNumberOfWithdrawalsFromCashMachines();
        // then
        assertEquals(4, result);
    }

    @Test
    void testAvgDeposits() {
        // when
        double result = bank.getAverageDepositsFromCashMachines();
        // then
        assertEquals(205, result);
    }

    @Test
    void testAvgWithdrawals() {
        // when
        double result = bank.getAverageWithdrawalFromCashMachines();
        // then
        assertEquals(-67.5, result);
    }
}