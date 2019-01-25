package com.techelevator;

public class introToClassesCard {
	
	public static void main(String[] args) {
        
        /*
         *  This program will demonstrate several concepts presented in the Java cohort 		
        */
		
		ginzCLI myGinzCLI = new ginzCLI(); // object to represent Command Line Interface (CLI) given
		
		PlayingCard aCard = new PlayingCard(); // instantiate a default playing card
		
		aCard.showCard(); // run ShowCard using our PlayingCard Object
		
		System.out.println("---------------------------------------------");
		
		PlayingCard card2 = new PlayingCard("Hearts", 5); // instantiate a 5 of Hearts
		card2.showCard();		
	
		System.out.println("---------------------------------------------");	
		PlayingCard card3 = new PlayingCard("Clubs", 8, "8-ball", "circular"); // instantiate a round 8 of clubs with an 8-ball
		card3.showCard();		
    
		System.out.println("---------------------------------------------");
		System.out.println("Color in card2 is: " + card2.getColor());
		System.out.println("image in card3 is: " + card3.getImage());
		card3.setImage("Tinkerbell");
		System.out.println("image in card3 is: " + card3.getImage());
		System.out.println("name of  card3 is: " + card3.getValueName());
		card3.setValue(1);
		System.out.println("name of  card3 is: " + card3.getValueName());
		card3.setValue(13);
		System.out.println("name of  card3 is: " + card3.getValueName());
		System.out.println("name of  card2 is: " + card2.getValueName());

		
	}
}
		 

