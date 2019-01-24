package com.techelevator.person;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		
		return lastName + ", " + firstName;
	}
	
	public boolean isAdult() {
		if(age >= 18) {
			return true;
		}
		return false;
	}
	
	
	
	//
	// Write code here
	//
	
}
