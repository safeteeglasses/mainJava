package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		//File wordSearch = new File("alices_adventures_in_wonderland.txt");
		//File shortStory = new File("short-story.txt");
		int lineCounter = 0;
		Scanner keyboard = new Scanner(System.in);
		File wordSearch = getInputFileFromUser();
		//Scanner fileScanner = new Scanner(wordSearch);
		
		
		try {
			Scanner file = new Scanner(wordSearch);
			System.out.println("What is the search word you are looking for?");
			Scanner wordInput = new Scanner(System.in);
			String word = wordInput.nextLine();
			
			
			while(file.hasNextLine()) {
				String line = file.nextLine();
				lineCounter++;
				if(line.contains(word)) {
					
					System.out.println(lineCounter + " " + line);
				}
				
				
			}		
		}
		catch (FileNotFoundException e) {
		}
	}
	
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		System.out.println("Path entered: "+ path + "\n");
		File inputFile = new File(path);  // define a File object to represent the file
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

}
