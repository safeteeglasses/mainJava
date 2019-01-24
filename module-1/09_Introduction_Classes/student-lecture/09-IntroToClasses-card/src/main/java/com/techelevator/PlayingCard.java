package com.techelevator;

public class PlayingCard {
	//Define the data member of the class
private String suit;
private String color;
private int value;
private String image;
private String shape;

	//Define methods for the class

	//Default constructor-assign default values to the data of the class
public PlayingCard() {
	suit = "Joker";
	color = "red";
	value = 0;
	image = "jester";
	shape = "rectangle";
}
	//Ctor for a card for only a suit and a value
public PlayingCard(String suit, int value) {
	//the keyword "this" indicates a member in the object being processed
	this.suit = suit;
	determineColor(suit);
	this.value = value;
	this.image = value + "" + " of " + suit;
	this.shape = "rectangle";
	
}
public PlayingCard(String suit, int value, String image, String shape) {
	this.suit = suit;
	determineColor(suit);
	this.value = value;
	this.image = image;
	this.shape = shape;
}


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
	switch (value) { //check the value in the variable specified
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
 * @return the image
 */
public String getImage() {
	return image;
}
/**
 * @param image the image to set
 */
public void setImage(String image) {
	this.image = image;
}
/**
 * @return the shape
 */
public String getShape() {
	return shape;
}
/**
 * @param shape the shape to set
 */
public void setShape(String shape) {
	this.shape = shape;
}
/**
 * @return the color
 */
public String getColor() {
	return color;
}
//method to determine card color based on the suit
private void determineColor(String suit) {
	//restrict usage to members of class- don't want class users to be able to run this
	this.suit = suit;
	if(suit.contentEquals("Clubs") || suit.contentEquals("Spades")) {
		color = "black";
	}
	else {
		if((suit.contentEquals("Diamonds") || suit.contentEquals("Hearts"))) {
		color = "red";
	}
	else {
		color = "unknown";
		}
	}

}
	//method to display the values in a PlayingCard
public void showCard() {
	System.out.println("Card suit: " + suit);
	System.out.println("Card color: " + color);
	System.out.println("Card value: " + value);
	System.out.println("Card image: " + image);
	System.out.println("Card shape: " + shape);
	
}

}
