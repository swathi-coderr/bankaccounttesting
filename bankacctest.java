package com.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount("Swathi", 1000);
        double newBalance = account.deposit(500);
        assertEquals(1500, newBalance);
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount("Swathi", 1000);
        double newBalance = account.withdraw(400);
        assertEquals(600, newBalance);
    }

    @Test
    void testWithdrawInvalid() {
        BankAccount account = new BankAccount("Swathi", 500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(600));
    }
}
