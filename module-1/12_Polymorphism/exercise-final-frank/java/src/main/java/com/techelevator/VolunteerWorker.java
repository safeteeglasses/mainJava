package com.techelevator;

public class VolunteerWorker extends Worker {

    //****************************************************************************************
	// member functions
	//****************************************************************************************

	public VolunteerWorker(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
@Override		
	public double calculateWeeklyPay(int numHoursWorked) {
		return 0;
		}
	
	
}
