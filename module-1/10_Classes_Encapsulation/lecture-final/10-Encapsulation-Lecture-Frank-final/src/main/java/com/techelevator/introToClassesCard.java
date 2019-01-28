package com.techelevator;

public class introToClassesCard {
	
	public static void main(String[] args) {
        
		
		PlayingCard aCard = new PlayingCard(); // instantiate a default playing card

		System.out.println("----------------------------------------------------------------");
		System.out.println("Display result of new PlayingCard()\n");
		aCard.showCard(); // run ShowCard using our PlayingCard Object
		
		System.out.println("----------------------------------------------------------------");
		
		PlayingCard card2 = new PlayingCard("Hearts", 5); // instantiate a 5 of Hearts

		System.out.println("Display result of new PlayingCard(\"Hearts\", 5)\n");
		card2.showCard();		
	
		System.out.println("----------------------------------------------------------------");	
		PlayingCard card3 = new PlayingCard("Clubs", 8, true); // instantiate a 8 of clubs face up

		System.out.println("Display result of new PlayingCard(\"Clubs\", 8, true)\n");
		card3.showCard();		
    
		System.out.println("----------------------------------------------------------------");
		System.out.println("Testing getters/setters\n");
		
		System.out.println("Color in card2 is: " + card2.getColor());

		System.out.println("name of  card3 is: " + card3.getValueName());
		card3.setValue(1);
		System.out.println("name of  card3 is: " + card3.getValueName());
		card3.setValue(13);
		System.out.println("name of  card3 is: " + card3.getValueName());
		System.out.println("name of  card2 is: " + card2.getValueName());
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Testing flip() method\n");
		System.out.println("card3 face up: " + card3.isFaceUp());
		card3.flip();
		System.out.println("card3 face up: " + card3.isFaceUp());
		System.out.println("----------------------------------------------------------------");
		
		PlayingCard card4 = new PlayingCard("Hearts", 12);
		PlayingCard card5 = new PlayingCard("Hearts", 12);
		System.out.println("----------------------------------------------------------------");
		System.out.println("card4 is " + card4);
		System.out.println("card5 is " + card5);
		
		if (card4.equals(card5)) {
			System.out.println("Cards are equal");
			}
			else {
				System.out.println("Cards are NOT equal");
				}
				
		
		System.out.println("----------------------------------------------------------------");

		
	}
}
		 

