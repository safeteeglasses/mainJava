package com.techelevator;

import java.math.BigDecimal;

public class BankAccount {
	
	private String accountNumber;
	
	// protected means any subclass has access to the data
	protected BigDecimal balance = new BigDecimal("0.0");

	public BankAccount() {
		accountNumber = "unknown";
	}
	
	public BankAccount(String acctNum, BigDecimal bal) {
		this.accountNumber = acctNum;
		this.balance = bal;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	private void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	//methods
	
	public BigDecimal deposit(BigDecimal amountToDeposit) {
		this.balance = this.balance.add(amountToDeposit);
		setBalance(balance);
		return balance;
	}
	
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		if(amountToWithdraw.doubleValue() <= this.balance.doubleValue()) {
			this.balance = this.balance.subtract(amountToWithdraw);
		}
			setBalance(balance);
			return balance;
	}
	
	public void transfer(BankAccount destinationAccount, BigDecimal transferAmount) {
		if(transferAmount.doubleValue() <= this.balance.doubleValue()) {
			this.balance = this.balance.subtract(transferAmount);
			destinationAccount.deposit(transferAmount);
		}
	}
	
	public void showAccountBalance() {
		System.out.println("Your current balance is: " + this.balance);
	}
}
