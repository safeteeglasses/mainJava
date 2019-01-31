package com.techelevator;

//****************************************************************************************
// Hourly Worker based on Worker class
//****************************************************************************************
public class HourlyWorker extends Worker implements PaidEmployees {
	
	//****************************************************************************************
	// Data members / Instance Variables
	//****************************************************************************************
	
	double hourlyRate;
	//****************************************************************************************
	// member functions
	//****************************************************************************************
		
	public HourlyWorker(String firstName, String lastName, double pay) {
		super(firstName, lastName);
		hourlyRate = pay;
	}
	

@Override		

public double calculateIncomeTax(double pay) {
	return pay * taxRate;
}

public double calculateWeeklyPay(int numHoursWorked) {
		
		if (numHoursWorked <= 40) {
			return hourlyRate * numHoursWorked;
		}
		else
			return (hourlyRate * 40) + ((hourlyRate * 1.5) * (numHoursWorked - 40));

	
}
}
