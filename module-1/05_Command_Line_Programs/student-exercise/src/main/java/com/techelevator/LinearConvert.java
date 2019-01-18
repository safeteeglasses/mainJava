package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		
		Scanner keyBoard = new Scanner(System.in);
		
		int length = 0;
		int newLength = 0;
		String aLine = "";
		
		System.out.println("Please enter the length:");
		aLine = keyBoard.nextLine();
		length = Integer.parseInt(aLine);
		
		System.out.println("Is the measurement in (m)eters, or (f)eet?");
		aLine = keyBoard.nextLine();
		
		if (aLine.equalsIgnoreCase("m")) {
			 newLength = (int) (length * 3.2808399); 
			 System.out.println(length + " meters is " + newLength + " feet.");
			 
		}
		if (aLine.equalsIgnoreCase("f")) {
			newLength =  (int) (length * 0.3048);
			System.out.println(length + " feet is " + newLength + " meters.");
		}
	}

	

}
