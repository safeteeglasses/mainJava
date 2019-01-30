package com.techelevator;

//****************************************************************************************
// Generic Worker class to be used as a base class for all type of workers
//****************************************************************************************

public class Worker {
	//****************************************************************************************
	// Data members / Instance Data
	//****************************************************************************************
		
	String firstName;
	String lastName;
	
	//****************************************************************************************
	// member functions
	//****************************************************************************************

	public Worker(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName  = lastName;
	}
	
	//****************************************************************************************
	// Getters / Setters
	//****************************************************************************************
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	//****************************************************************************************
	// Need to define "dummy" method that will be overridden by subclasses
	//****************************************************************************************
		
		public double calculateWeeklyPay(int numHoursWorked) {
			return -1;
		}

}
