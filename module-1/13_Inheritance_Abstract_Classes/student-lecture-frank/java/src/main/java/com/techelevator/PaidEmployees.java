package com.techelevator;

public interface PaidEmployees {
	
		static final double taxRate = .10;

		public double calculateWeeklyPay(int numHoursWorked); 
			
		double calculateIncomeTax(double pay);
}
