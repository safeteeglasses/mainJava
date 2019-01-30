package com.techelevator;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
	
	BigDecimal overdraftFee = new BigDecimal("10.00");
	
public CheckingAccount() {
	super();
}
public CheckingAccount(String acctNum, BigDecimal bal) {
	super(acctNum, bal);
}
//
// Since balance is defined as protected in base class (BankAccount)
// this subclass can access it directly rather than having to use
// the getBalance() method of the base class
// 
@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
	
		if(amountToWithdraw.doubleValue() <= balance.doubleValue()) {
			 super.withdraw(amountToWithdraw);
			 return balance;
		}
		else {
			if((balance.doubleValue() - amountToWithdraw.doubleValue()) < 0.00 &&
				(balance.doubleValue() - amountToWithdraw.doubleValue()) >= -100.00) {
			super.withdraw(overdraftFee);
			return balance;
			}
		}
		return balance;
	}
	
}
