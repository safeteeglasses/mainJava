package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		 Scanner keyBoard = new Scanner(System.in);
		 
		 int number = 0;
		 String aLine = "";
		
		 String [] multipleNumbers = aLine.split(" ");  
		 
		 
		 
	        System.out.println("Please enter in a series of decimal values (separated by spaces):");
	        number = keyBoard.nextInt();
	        
	        
	        
	        if (number < 0) {
	            System.out.println("Error: Not a positive integer");
	        } else { 

	            System.out.print( number + " in binary is " );
	            printBinaryform(number);
	        }
	        
	    }
	
			private static void printBinaryform(int number) {
	        int remainder = 0;

	        if (number <= 1) {
	            System.out.print(number);
	            return;   
	        }

	        remainder = number % 2; 
	        printBinaryform(number >> 1);
	        System.out.print(remainder);
	    }
		
	}
