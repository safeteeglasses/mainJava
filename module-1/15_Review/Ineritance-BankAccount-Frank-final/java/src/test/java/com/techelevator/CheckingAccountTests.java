package com.techelevator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CheckingAccountTests {
	
    @Test
    public void WithdrawNegativeWithFeeBalance_Test() {
        CheckingAccount chkAccount = new CheckingAccount("", "", new DollarAmount(-100));

        DollarAmount newBalance = chkAccount.withdraw(new DollarAmount(100));

        assertEquals(-1200, newBalance.getTotalAmountInCents());
        assertEquals(-1200, chkAccount.getBalance().getTotalAmountInCents());            
    }

    @Test
    public void WithdrawPositiveWithFee_Test()
    {
        CheckingAccount chkAccount = new CheckingAccount("", "", new DollarAmount(-100));

        DollarAmount newBalance = chkAccount.withdraw(new DollarAmount(200));

        assertEquals(-1300, newBalance.getTotalAmountInCents());
        assertEquals(-1300, chkAccount.getBalance().getTotalAmountInCents());
    }

    @Test
    public void WithdrawNegativeBalanceBelow100_Test() {
        CheckingAccount chkAccount = new CheckingAccount("", "", new DollarAmount(-10000));

        DollarAmount newBalance = chkAccount.withdraw(new DollarAmount(200));

        assertEquals(-10000, newBalance.getTotalAmountInCents());
        assertEquals(-10000, chkAccount.getBalance().getTotalAmountInCents());
    }

    @Test
    public void WithdrawPositiveBalance_Test() {
        CheckingAccount chkAccount = new CheckingAccount("", "", new DollarAmount(1000));

        DollarAmount newBalance = chkAccount.withdraw(new DollarAmount(500));

        assertEquals(500, newBalance.getTotalAmountInCents());
        assertEquals(500, chkAccount.getBalance().getTotalAmountInCents());
    }
}
