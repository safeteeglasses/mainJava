package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;
	
	
	
	
	/**
	 * @return the planeNumber
	 */
	public String getPlaneNumber() {
		return planeNumber;
	}

	/**
	 * @return the bookedFirstClassSeats
	 */
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	/**
	 * @return the availableFirstClassSeats
	 */
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}

	/**
	 * @return the totalFirstClassSeats
	 */
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	/**
	 * @return the bookedCoachSeats
	 */
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	/**
	 * @return the availableCoachSeats
	 */
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}

	/**
	 * @return the totalCoachSeats
	 */
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}

	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		 this.planeNumber = planeNumber;
		 this.totalFirstClassSeats = totalFirstClassSeats;
		 this.totalCoachSeats = totalCoachSeats;
		 determineAvailableFirstClassSeats(availableFirstClassSeats);
		 determineAvailableCoachSeats(availableCoachSeats);
		 this.bookedFirstClassSeats = totalFirstClassSeats - availableFirstClassSeats;
		 this.bookedCoachSeats = totalCoachSeats - availableCoachSeats;
	 }
	 
	private void determineAvailableFirstClassSeats(int availableFirstClassSeats) {
		this.availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
	}
	
	
	private void determineAvailableCoachSeats(int availableCoachSeats) {
		this.availableCoachSeats = totalCoachSeats - bookedCoachSeats;
	}
	
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if(forFirstClass) {
		if(totalNumberOfSeats > getAvailableFirstClassSeats()) {
			return false;
		}
		bookedFirstClassSeats += totalNumberOfSeats;
		
		}
		else {
			if(totalNumberOfSeats > getAvailableCoachSeats()) {
				return false;
			}
				bookedCoachSeats += totalNumberOfSeats;
				
		}
		return true;
	}
	
	
}
