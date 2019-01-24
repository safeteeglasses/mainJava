package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	
	/**
	 * @return the totalNumberOfItems
	 */
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	/**
	 * @param totalNumberOfItems the totalNumberOfItems to set
	 */
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	/**
	 * @return the totalAmountOwed
	 */
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	/**
	 * @param totalAmountOwed the totalAmountOwed to set
	 */
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	public double getAveragePricePerItem() {
		 if(totalAmountOwed == 0 || totalNumberOfItems == 0) {
			 return 0.0;
		 }
		 return totalAmountOwed / totalNumberOfItems;
	 }
	 public void addItems(int numberOfItems, double pricePerItem) {
		 totalNumberOfItems = numberOfItems + totalNumberOfItems;
		 totalAmountOwed = totalAmountOwed+(pricePerItem * numberOfItems);
	 }
	 public void empty() {
		 totalNumberOfItems = totalNumberOfItems - totalNumberOfItems;
		  totalAmountOwed = totalAmountOwed - totalAmountOwed;
	 }
	
	//
	// Write code here
	//
	
}
