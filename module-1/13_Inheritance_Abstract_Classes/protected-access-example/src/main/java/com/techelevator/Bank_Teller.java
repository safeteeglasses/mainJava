package com.techelevator;

import java.math.BigDecimal;

public class Bank_Teller {

	public static void main(String[] args) {
		
	BankAccount Sam = new BankAccount("1234124", new BigDecimal ("100.00"));
	BankAccount Cyrus = new BankAccount();
	CheckingAccount Frank = new CheckingAccount();
	SavingsAccount Bobby = new SavingsAccount();
	BankCustomer Buddy = new BankCustomer();
	
	CheckingAccount checkingAccount = new CheckingAccount();
	SavingsAccount savingsAccount = new SavingsAccount();
	BankAccount bankAccount = new BankAccount();
	
	Cyrus.deposit(new BigDecimal("178.56"));
	Cyrus.showAccountBalance();
	Sam.withdraw(new BigDecimal("10.00"));
	Cyrus.transfer(Sam, new BigDecimal("50.01"));
	Sam.showAccountBalance();
	
	Frank.deposit(new BigDecimal("50.00"));
	Frank.withdraw(new BigDecimal("51.00"));
	Frank.showAccountBalance();
	
	Bobby.deposit(new BigDecimal("200.00"));
	Bobby.withdraw(new BigDecimal("51.00"));
	Bobby.withdraw(new BigDecimal("1.00"));
	Bobby.addInterest();
	Bobby.showAccountBalance();
	
	Buddy.addAccount(savingsAccount);
	Buddy.addAccount(checkingAccount);
	
	System.out.println(String.format("Buddy has %s accounts. ", Buddy.getAccounts().size()));
	
	}
}
