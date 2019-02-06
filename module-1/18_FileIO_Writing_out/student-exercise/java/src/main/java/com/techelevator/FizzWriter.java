package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws IOException {
		
		
		File fizzBuzz1to300 = new File("fizzBuzz.txt");
		fizzBuzz1to300.createNewFile();
		System.out.println("FizzBuzz application has started:");
		
		String[] oneTo300 = new String [300];
		for(int i = 1; i<=300; i++) {
			oneTo300[i-1] = toFizzBuzz(i);
		
		
		try(PrintWriter writer = new PrintWriter(fizzBuzz1to300)) {
			for(String numbers : oneTo300) {
				writer.println(numbers);
				
			}
		
		}
			}
		System.out.println("FizzBuzz application has ended");
	}
	public static String toFizzBuzz(int num) {
		if (num > 300) {
			return "";
		}
		if (num == 0) {
			return "" + num +"";
		}
		if(num == 1) {
			return "1";
		}
		if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		}
		if ((num +"").contains("3") && ((num + "").contains("5"))) {
			return "FizzBuzz";
		}
		if (num % 3 == 0 || ((num + "").contains("3"))) {
			return "Fizz";
		}
		if (num % 5 == 0 || ((num + "").contains("5"))) {
			return "Buzz";
		
		}
			return "" + num + "";
	}

	
	
	
}
