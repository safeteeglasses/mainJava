package com.techelevator;

public class KataFizzBuzz {
	
	public static String fizzBuzz(int num) {
		
		
		if (num > 100) {
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
		if (num % 3 == 0) {
			return "Fizz";
		}
		if (num % 5 == 0) {
			return "Buzz";
		}
		
		
		
		return "" + num + "";
	}

}
