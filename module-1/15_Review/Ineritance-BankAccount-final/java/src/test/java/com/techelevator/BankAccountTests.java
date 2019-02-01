package com.techelevator;

import static org.junit.Assert.*;
import org.junit.Test;

public class BankAccountTests {
	
    @Test
    public void NewCustomerHasZeroBalance() {
        BankAccount account = new BankAccount("", "");
        assertEquals(0, account.getBalance().getTotalAmountInCents());            
    }

    @Test
    public void NewCustomerHasStartingBalance() {
        BankAccount account = new BankAccount("", "", new DollarAmount(100));
        assertEquals(100, account.getBalance().getTotalAmountInCents());    
    }

    @Test
    public void DepositIncreasesBalance() {
        BankAccount account = new BankAccount("", "");

        DollarAmount newBalance = account.deposit(new DollarAmount(100));

        assertEquals(100, newBalance.getTotalAmountInCents());
        assertEquals(100, account.getBalance().getTotalAmountInCents());
    }

    @Test
    public void WithdrawDecreasesBalance() {
        BankAccount account = new BankAccount("", "");

        DollarAmount newBalance = account.withdraw(new DollarAmount(100));

        assertEquals(-100, newBalance.getTotalAmountInCents());
        assertEquals(-100, account.getBalance().getTotalAmountInCents());
    }

    @Test
    public void TransferTests() {
        BankAccount source = new BankAccount("", "", new DollarAmount(5000));
        BankAccount destination = new BankAccount("", "");

        DollarAmount newSourceBalance = source.TransferTo(destination, new DollarAmount(2400));

        assertEquals(2600, newSourceBalance.getTotalAmountInCents());
        assertEquals(2400, destination.getBalance().getTotalAmountInCents());
        assertEquals(2600, source.getBalance().getTotalAmountInCents());
    }
}
