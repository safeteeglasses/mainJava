package com.techelevator;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount extends BankAccount {
	
public SavingsAccount() {
	super();
}

public SavingsAccount(String acctNum, BigDecimal bal) {
	super(acctNum, bal);
}
	
	private static BigDecimal interestRate = new BigDecimal(".02");
	

//
// Since balance is defined as protected in base class (BankAccount)
// this subclass can access it directly rather than having to use
// the getBalance() method of the base class
//
@Override
public BigDecimal withdraw(BigDecimal amountToWithdraw) {
	
	if(amountToWithdraw.doubleValue() <= balance.doubleValue()) {
		if(balance.doubleValue()<150.00) {
				super.withdraw(new BigDecimal ("2.00"));
			if(amountToWithdraw.doubleValue() <= balance.doubleValue()) {
				super.withdraw(amountToWithdraw);
				return balance;
		}
		}
		else if(balance.doubleValue() >= 150.00) {
			super.withdraw(amountToWithdraw);
			return balance;
		}
	}
	return balance;
}

public void addInterest() {
	this.deposit(balance.multiply(interestRate).setScale(2, RoundingMode.DOWN));
}
}
