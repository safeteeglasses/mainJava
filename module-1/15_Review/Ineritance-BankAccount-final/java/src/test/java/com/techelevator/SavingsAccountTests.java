package com.techelevator;

import static org.junit.Assert.*;
import org.junit.Test;

public class SavingsAccountTests {
	
    @Test
    public void TryToWithdrawFromNegativeBalance() {
        SavingsAccount savAcct = new SavingsAccount("", "", new DollarAmount(-100));

        DollarAmount newBalance = savAcct.withdraw(new DollarAmount(100));

        assertEquals(-100, newBalance.getTotalAmountInCents());
        assertEquals(-100, savAcct.getBalance().getTotalAmountInCents());
    }

    @Test
    public void SendPositiveIntoNegativeTest() {
        SavingsAccount savAcct = new SavingsAccount("", "", new DollarAmount(100));

        DollarAmount newBalance = savAcct.withdraw(new DollarAmount(200));

        assertEquals(100, newBalance.getTotalAmountInCents());
        assertEquals(100, savAcct.getBalance().getTotalAmountInCents());
    }


    @Test
    public void TryToWithdrawFromPositiveBalance() {
        SavingsAccount savAcct = new SavingsAccount("", "", new DollarAmount(20000));

        DollarAmount newBalance = savAcct.withdraw(new DollarAmount(1000));

        assertEquals(19000, newBalance.getTotalAmountInCents());
        assertEquals(19000, savAcct.getBalance().getTotalAmountInCents());
    }

    @Test
    public void TryToWithdrawFromBalanceBelow150() {
        SavingsAccount savAcct = new SavingsAccount("", "", new DollarAmount(15100));

        DollarAmount newBalance = savAcct.withdraw(new DollarAmount(1000));

        assertEquals(13900, newBalance.getTotalAmountInCents());
        assertEquals(13900, savAcct.getBalance().getTotalAmountInCents());
    }
}
