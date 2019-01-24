package com.techelevator.calculator;

public class Calculator {

	private int currentValue;
	
	
	
	
	/**
	 * @return the currentValue
	 */
	public int getCurrentValue() {
		return currentValue;
	}
	/**
	 * @param currentValue the currentValue to set
	 */
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	public int add(int addend) {
		currentValue = currentValue + addend;
		return currentValue;
	}
	public int multiply(int multiplier) {
		currentValue = currentValue * multiplier;
		return currentValue;
	}
	public int subtract(int subtrahend) {
		currentValue = currentValue - subtrahend;
		return currentValue;
	}
	public int power(int exponent) {
		for(int i = 1; i < exponent; i++) {
			currentValue = currentValue * currentValue;
			}
			return currentValue;
	}
	public void reset() {
		currentValue = 0;
		return ;
	}
	//
	// Write code here
	//
	
}
