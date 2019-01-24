package com.techelevator;

public class introToClassesCard {
	
	public static void main(String[] args) {
        
        /*
         *  This program will demonstrate several concepts presented in the Java cohort 		
        */
		
		ginzCLI myGinzCLI = new ginzCLI(); // object to represent Command Line Interface (CLI) given
		System.out.println("-----------------------------------------------");
		PlayingCard aCard = new PlayingCard(); //instantiate a default playing card
		aCard.showCard(); //run showCard using card object
		System.out.println("-----------------------------------------------");
		PlayingCard card2 = new PlayingCard("Hearts", 5); //instantiate a 5 of hearts
		card2.showCard();
		System.out.println("-----------------------------------------------");
		PlayingCard card3 = new PlayingCard("Clubs", 8, "8-ball", "circular");
		card3.showCard();
		System.out.println("-----------------------------------------------");
		System.out.println("Color in card2 is: " + card2.getColor());
		System.out.println("-----------------------------------------------");
		System.out.println("Image in card3 is: " + card3.getImage());
		System.out.println("-----------------------------------------------");
		card3.setImage("Happy Trees");
		System.out.println("Image in card3 is: " + card3.getImage());
		System.out.println("-----------------------------------------------");
		System.out.println(card3.getValueName());
		System.out.println("-----------------------------------------------");
		card3.setValue(13);
		System.out.println(card3.getValueName());
		System.out.println("-----------------------------------------------");
    }
}
		 

