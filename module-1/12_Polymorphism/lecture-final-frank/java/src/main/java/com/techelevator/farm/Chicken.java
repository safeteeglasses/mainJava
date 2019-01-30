package com.techelevator.farm;

public class Chicken extends FarmAnimal {
	
	public Chicken() {
		super("Chicken", "cluck!");   // call the super class constructor with the data it needs
	}
	
	@Override
	public String getSound() {
	
	return "I say, I say " + super.getSound();  // need to use the super class method because sound is private in super class
		
	}
	
	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

}