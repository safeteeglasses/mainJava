package com.techelevator;

import static org.junit.Assert.*;
import org.junit.Test;

public class BankCustomerTests
{
    @Test
    public void NewCustomerHasNoAccounts() {
        BankCustomer customer = new BankCustomer();
        assertEquals(0, customer.getAccounts().length);
    }

    @Test
    public void CustomerAddAccount() {
        BankCustomer customer = new BankCustomer();
        assertEquals(0, customer.getAccounts().length);
        customer.addAccount(new BankAccount("", ""));
        assertEquals(1, customer.getAccounts().length);
    }

    @Test
    public void BalancesLessThan25K_NotVIP() {
        BankCustomer customer = new BankCustomer();
        BankAccount thousandAccount = new BankAccount("","", new DollarAmount(100000)); //$1000
        BankAccount twentyFourThousandAcct = new BankAccount("", "", new DollarAmount(2400000));
        customer.addAccount(thousandAccount);
        assertFalse(customer.isVip());
        customer.addAccount(twentyFourThousandAcct);
        assertTrue(customer.isVip());
    }
}

