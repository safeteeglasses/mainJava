package com.techelevator;

public interface PaidEmployee {
	
	// One implements this interface they MUST provide these methods
	
	static final double taxRate = .10;
	
	public double calculateWeeklyPay(int numHoursWorked) ; 
	
	double calculateIncomeTax(double pay) ; 

}
