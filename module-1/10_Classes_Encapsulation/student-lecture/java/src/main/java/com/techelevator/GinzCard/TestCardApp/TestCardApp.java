package TestCardApp;

import CardDeck.CardDeck;
import CardHand.CardHand;
import PokerHand.PokerHand;

public class TestCardApp {

	public static void main(String[] args) {

		CardDeck myDeck = new CardDeck();
		CardHand myHand = new CardHand();
		PokerHand myPokerHand = new PokerHand();

		System.out.println("-----------------------------------------------------");
		System.out.println("-- Showing Cards in Deck                           --");
		System.out.println("-----------------------------------------------------");

		myDeck.showDeck();

		System.out.println("-----------------------------------------------------");
		System.out.println("-- Removing Jokers from Deck                       --");
		System.out.println("-----------------------------------------------------");

		System.out.println("Number Jokers Removed: " + myDeck.removeJokers());

		System.out.println("-----------------------------------------------------");
		System.out.println("-- Shuffling Deck                                  --");
		System.out.println("-----------------------------------------------------");

		myDeck.shuffleDeck();

		System.out.println("-----------------------------------------------------");
		System.out.println("-- Dealing Cards from Deck                         --");
		System.out.println("-----------------------------------------------------");

		while (myDeck.anyCardsInDeck())
			System.out.println(myDeck.dealCard().toString());

		System.out.println("-----------------------------------------------------");
		System.out.println("-- Dealing Cards to a PokerHand                    --");
		System.out.println("-----------------------------------------------------");

		myDeck.resetDeck(false);
		myDeck.shuffleDeck();

		myPokerHand.addCard(myDeck.dealCard());
		myPokerHand.addCard(myDeck.dealCard());
		myPokerHand.addCard(myDeck.dealCard());
		myPokerHand.addCard(myDeck.dealCard());
		myPokerHand.addCard(myDeck.dealCard());

		myPokerHand.show();
		/*
		 * System.out.println("-----------------------------------------------------");
		 * System.out.println("-- Sorting PokerHand by Value                      --");
		 * System.out.println("-----------------------------------------------------");
		 * 
		 * myPokerHand.sortByValue(); 
		 * myPokerHand.show();
		 * 
		 * System.out.println("-----------------------------------------------------");
		 * System.out.println("-- Sorting PokerHand by Color                      --");
		 * System.out.println("-----------------------------------------------------");
		 * 
		 * myPokerHand.sortByColor(); 
		 * myPokerHand.show();
		 * 
		 * System.out.println("-----------------------------------------------------");
		 * System.out.println("-- Sorting PokerHand by Suit                       --");
		 * System.out.println("-----------------------------------------------------");
		 * 
		 * myPokerHand.sortBySuit(); 
		 * myPokerHand.show();
		 * 
		 * System.out.println("-----------------------------------------------------");
		 * System.out.println("-- Ranking PokerHand                               --");
		 * System.out.println("-----------------------------------------------------");
		 * 
		 * boolean done = false; 
		 * int numDeals = 0; 
		 * while (!done) 
		 * { 
		 * numDeals++;
		 * myPokerHand.clearHand(); 
		 * myDeck.resetDeck(false); 
		 * myDeck.showDeck();
		 * 
		 * myPokerHand.addCard(myDeck.dealCard());
		 * myPokerHand.addCard(myDeck.dealCard());
		 * myPokerHand.addCard(myDeck.dealCard());
		 * myPokerHand.addCard(myDeck.dealCard());
		 * myPokerHand.addCard(myDeck.dealCard());
		 * 
		 * if (myPokerHand.rankHand() == PokerHandRanking.FULLHOUSE) {
		 * System.out.println(myPokerHand.rankHand());
		 *  myPokerHand.show(); 
		 *  done = true;
		 * } 
		 * }
		 *  System.out.println("Number of Deals: " + numDeals);
		 */
	}

}
