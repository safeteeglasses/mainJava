package com.techelevator;

public class FruitTree {
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	/**
	 * @return the typeOfFruit
	 */
	public String getTypeOfFruit() {
		return typeOfFruit;
	}

	/**
	 * @return the piecesOfFruitLeft
	 */
	public int getPiecesOfFruitLeft() {
		
		return piecesOfFruitLeft;
	}

	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		 this.typeOfFruit = typeOfFruit;
		 this.piecesOfFruitLeft = startingPiecesOfFruit;
		
		 
	 }
	 
	public boolean pickFruit(int numberOfPiecesToRemove) {
		
		
		if(piecesOfFruitLeft > 0 ) {
			piecesOfFruitLeft = piecesOfFruitLeft-numberOfPiecesToRemove;
			return true;
		}
		return false;
		
	}
		

		

	
}
