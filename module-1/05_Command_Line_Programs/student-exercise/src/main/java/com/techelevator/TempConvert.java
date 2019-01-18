package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);
		
		
		int temp = 0;
		int newTemp = 0;
		String aLine = "";
		
		System.out.println("Please enter the temperature.");
		aLine = keyBoard.nextLine();
		temp = Integer.parseInt(aLine);
		
		System.out.println("Is the temperature in (C)elcius, or (F)arenheit?");
		aLine = keyBoard.nextLine();
		
		if (aLine.equalsIgnoreCase("F")) {
			 newTemp = (int) ((temp - 32) / 1.8);
			 System.out.println(temp + "F is " + newTemp + "C");
			 
		}
		if (aLine.equalsIgnoreCase("C")) {
			newTemp =  (int) (temp * 1.8 + 32);
			System.out.println(temp + "C is " + newTemp + "F");
		}
	}

}
