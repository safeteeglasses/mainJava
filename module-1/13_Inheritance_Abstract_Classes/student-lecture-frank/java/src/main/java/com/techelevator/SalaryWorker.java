package com.techelevator;

public class SalaryWorker extends Worker {
	
	//****************************************************************************************
	// Data members / Instance Data
	//****************************************************************************************
	
	double annualSalary;
	
	//****************************************************************************************
	// Getters and Setters
	//****************************************************************************************	
	/**
	 * @return the annualSalary
	 */
	public double getAnnualSalary() {
		return annualSalary;
	}

	//****************************************************************************************
	// member functions
	//****************************************************************************************

	public SalaryWorker(String firstName, String lastName, double pay) {
		super(firstName, lastName);
		annualSalary = pay;
	}
	
	
	@Override		
	public double calculateWeeklyPay(int numHoursWorked) {
		return annualSalary / 52;
	}

}
