package com.techelevator;

import java.util.Scanner; // Include the Java code to support the Scanner

public class Lecture {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in); // Defining the Scanner object to access keyboard
		
		int aNumber = 0; // Variable to hold keyboard input
		int anotherNumber = 0;
		double pctg = 0.0;
		
		
		String aLine = ""; //Variable to hold line from keyboard
		
		System.out.println("Please could you be so kind and enter a number? :)");
		aLine = keyBoard.nextLine(); //get a line from keyboard and put it in variable aLine
		aNumber = Integer.parseInt(aLine); //Converts a string to an integer
		
		System.out.println("Please enter another number");
		aLine = keyBoard.nextLine();
		anotherNumber = Integer.parseInt(aLine);
		
		aNumber += anotherNumber;
		
		
		
		System.out.println("Sum is: " +  aNumber);
		
		
	}

}
