package com.techelevator;

public class PlayingCard {
// define the data members of the class
private String  suit;
private String  color;
private int     value;
private boolean faceUp;

// define methods for the class

// default constructor - assign default values to data of the class

public PlayingCard() {
	suit = "Joker";
	color = "red";
	value = 0;
	faceUp=false;
}

// ctor for a card for only a suit, value
public PlayingCard(String suit, int value) {
// the keyword "this" indicates a member in the object being processed
	this.suit = suit;
	determineColor(suit);
	this.value = value;
	faceUp=false;
}


// ctor to create card with suit, value, faceUp
public PlayingCard(String suit, int value, boolean faceUp) {
	this.suit = suit;
	determineColor(suit);
	this.value = value;
	this.faceUp = faceUp;
}	


// method to determine card color based on the suit
// restrict usage to members of class - don't want class users to be able to be to run this

/**
 * @return the suit
 */
public String getSuit() {
	return suit;
}

/**
 * @param suit the suit to set
 */
public void setSuit(String suit) {
	this.suit = suit;
}

/**
 * @return the value
 */
public int getValue() {
	return value;
}
public String getValueName() {
	switch (value) {   // check the value in the variable give
	case 0:            // if the value is this...
		return "Joker";// do this
	case 1:           
		return "Ace"; 
	case 2:
		return "Two";
	case 3:
		return "Three";	
	case 4:
		return "Four";
	case 5:
		return "Five";
	case 6:
		return "Six";
	case 7:
		return "Seven";
	case 8:
		return "Eight";
	case 9:
		return "Nine";
	case 10:
		return "Ten";
	case 11:
		return "Jack";
	case 12:
		return "Queen";
	case 13:
		return "King";
	}
	return "unknown";
}
/**
 * @param value the value to set
 */
public void setValue(int value) {
	this.value = value;
}
/**
 * @return the color
 */
public String getColor() {
	return color;
}

/**
 * @return the faceUp
 */
public boolean isFaceUp() { //get method for boolean is called "isName"
	return faceUp;
}

/**
 * @param faceUp the faceUp to set
 */
public void setFaceUp(boolean faceUp) {
	this.faceUp = faceUp;
}
// flip the card 
public boolean flip()
{
	faceUp = !faceUp;	
	return isFaceUp();  // use class method to retrieve value
}


private void determineColor(String suit) {
	
	if (suit.equals("Clubs") || suit.equals("Spades")) {
		 color = "black";
	}
	else {
		if (suit.equals("Hearts") || suit.equals("Diamonds")) {
			color = "red";
		}
		else {
			color = "unknown";
		}
	}
}
//add toString() - convert a PlayingCard to a String
public String toString() {
	return "The " + value + " of " + suit + " is " + color + " and " + "" + faceUp;
}
public boolean equals(PlayingCard otherCard) {
	if(this.value == otherCard.value && this.suit.equals(otherCard.suit) && this.color.equals(otherCard.color)) {
		return true;
	}
		return false;
}
		
	



// method to display the values in a PlayingCard
public void showCard() {
	System.out.println("     Card  suit: " + suit);
	System.out.println("     Card color: " + color);
	System.out.println("     Card value: " + value);
	System.out.println("Card is face up: " + faceUp);
}
}
