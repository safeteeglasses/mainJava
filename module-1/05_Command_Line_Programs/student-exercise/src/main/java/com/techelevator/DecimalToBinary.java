package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in);
		
		String aLine = "";
		double binaryNumber = 0;
		
		System.out.println("Please enter in a decimal number.");
		aLine = keyBoard.nextLine();
		binaryNumber = Double.parseDouble(aLine);
		
		double n = 0;
		double[] binaryNum = new double[100]; //<--- this is the array created that will hold binary number
		int i = 0; //counter number going through the for loop
		while (n > 0) {
			binaryNum [i] = n % 2;
			n = n / 2;
			i ++;
		}
		
		for (double j = i - 1; j >= 0; j--) {
			System.out.println(binaryNum [i]);
			aLine = keyBoard.nextLine();
			binaryNumber = Double.parseDouble(aLine);
		}
       
	}

}
