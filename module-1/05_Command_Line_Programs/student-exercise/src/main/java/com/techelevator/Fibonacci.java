package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);
		
		int numberBefore = 1;
		int numberTwoBefore = 0;
		int fibNumber = 0;
		int currentNumber = numberTwoBefore + numberBefore;
		String aLine = "";
		
		System.out.println("Please enter the Fibonacci number:");
		aLine = keyBoard.nextLine();
		fibNumber = Integer.parseInt(aLine);
		
		System.out.print("0" + " " + "1" + " ");
		
		while (numberBefore + numberTwoBefore < fibNumber) {
			currentNumber = (numberBefore + numberTwoBefore);
			numberTwoBefore = numberBefore;
			numberBefore = currentNumber;
			
			
			System.out.print(currentNumber + " ");
			
		}

	}

}
