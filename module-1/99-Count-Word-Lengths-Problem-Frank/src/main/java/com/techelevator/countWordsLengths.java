package com.techelevator;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class countWordsLengths{

	public static void main(String[] args) 
	{
	
		System.out.println("--------------------------------------------");

		String Sentence = "Fore score and seven years ago our forefathers brought forth on this continent a new nation conceived in liberty and dedicated to the proposition that all men are created equal";
		CountWordLengthsArray(Sentence);	
		
		CountWordLengthsMap(Sentence);
		
		System.out.println("--------------------------------------------");
		
	}
	
	public static void CountWordLengthsArray(String sentence) {	

		int[] lengths = new int[1909];  // one element for each possible word length 
		                                // max longest undisputed English word is 1909 characters
		
		for(int i = 0; i<lengths.length; i++) lengths[i]=0;
				
		System.out.println("Sentence: " + sentence + "\n");
		
		String[] words = sentence.split(" ");  // Create a String array of words (chars separated by spaces)
		
		for (String aWord : words)
		{
			lengths[aWord.length()]++;
		}
		for(int i = 0; i<lengths.length; i++) // Loop through array of words
		{
			if (lengths[i] != 0)  // only process word lengths we encountered.  ie. ignore if count is 0
			System.out.println("Num words of length " + i + " : " + lengths[i]);	
		}
	}
	
	
	
	public static void CountWordLengthsMap(String sentence) {	

		Map<Integer, Integer> lengthCount = new TreeMap<Integer, Integer>();
				
		System.out.println("Sentence: " + sentence + "\n");
		
		String[] words = sentence.split(" ");       // Create a String array of words (chars separated by spaces)
		
		for (String aWord : words)                          // Loop through array of words
		{
			if(lengthCount.containsKey(aWord.length())) {   // if we already have a word of this length 
				lengthCount.put(aWord.length(), lengthCount.get(aWord.length()).intValue()+1); // add 1 to it's count
			     }
			else {
				 lengthCount.put(aWord.length(), 1);        // if first word of this length, add it to map with count of 1
				 }
		}
		Set<Integer> keys = lengthCount.keySet();
		for(Integer anInt : keys) {
			System.out.println("Num words of length " + anInt + " : " + lengthCount.get(anInt));	
			
		}
	}

}
