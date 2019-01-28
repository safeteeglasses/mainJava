package com.techelevator;

public class Television {
	
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	public Television() {
		isOn = false;
		currentChannel = 3;
		currentVolume = 2;
	}
	/**
	 * @return the isOn
	 */
	public boolean isOn() {
		return isOn;
	}

	/**
	 * @return the currentChannel
	 */
	public int getCurrentChannel() {
		return currentChannel;
	}

	/**
	 * @return the currentVolume
	 */
	public int getCurrentVolume() {
		return currentVolume;
	}

	public void turnOff() {
		this.isOn = false;
		}
	
	public void turnOn() {
		this.isOn = true;
		this.currentChannel = 3;
		this.currentVolume = 2;
	}
	
	public void changeChannel(int newChannel) {
		if(this.isOn == true) {
		currentChannel = newChannel; 
		 	
			
		}
		
	}
	public void channelUp() {
		if(isOn && currentChannel < 18) {
		this.currentChannel += 1;
		}
		else {
			if(isOn && currentChannel == 18) {
				currentChannel = 3;
			}
		}
	}
	public void channelDown() {
		if(isOn && currentChannel > 3) {
		this.currentChannel -= 1;
		}
		else {
			if(isOn && currentChannel == 3) {
				currentChannel = 18;
			}
		}
	}
	public void raiseVolume() {
		if(isOn && currentVolume < 10) {
		currentVolume += 1;
		}
	}
	public void lowerVolume() {
		if(isOn && currentVolume > 0) {
		currentVolume -= 1;
		}
	}
}

	