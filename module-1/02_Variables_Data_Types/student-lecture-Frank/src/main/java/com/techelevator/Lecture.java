package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/

		int numberOfExercises = 26;
		// String values are enclose in " "
		// add/concatenate values to a string using +
		
		 System.out.println("numberOfExercises is " + numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		 double half = 0.5;
		 
		System.out.println("half is " + half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/

		String name = "Tech Elevator";  // String is not a primitive data type
		
		System.out.println("name is " + name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

		int seasonsOfFirefly = 1;
		
		System.out.println("seasonsOfFirefly is " + seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

		String myFavoriteLanguage = "Java";
		
		System.out.println("myFavoriteLanguage is " + myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/

		double pi = 3.1416;
		
		float pie = 3.1416F;  // use the datatype indicator to tell Java it's a float
	
		System.out.println("pi is " + pi  + " pie is " + pie);
		  
		/*
		7. Create and set a variable that holds your name.
		*/
		String yourName; // = "your name";
		String yurName = ""; 
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int numberOfButtons;
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		double percentOfBatteryLeft;
		int    percentOfBatteryLeft2;
		
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		int diff = 121 - 27;  
		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		double sumDouble = 12.3 + 32.1;
		/*
		12. Create a String that holds your full name.
		*/
		String fullName = "Frank Joseph Fella";
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String someName = "Hello, " + fullName;
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		fullName = fullName + " Esquire";
		
		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		fullName += " Esquire";
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		String movieName = "Saw" + 2;  // + "2"
		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		movieName += 0; // = movieName + 0;
		/*
		18. What is 4.4 divided by 2.2?
		*/
		System.out.println("4.4 divided by 2.2 is " + 4.4 / 2.2);
		/* +
		19. What is 5.4 divided by 2?
		*/
		System.out.println("5.4 divided by 2 is " + 5.4 /2);
		/*
		20. What is 5 divided by 2?
		*/
		System.out.println("5 divided by 2 is " + 5 / 2);
		/*
		21. What is 5.0 divided by 2?
		*/
		System.out.println("5.0 divided by 2 is " + 5.0 / 2);
		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		System.out.println("66.6 divided by 100 is " + 66.6 / 100);
		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		System.out.println("Remainder of 5 divided by 2 is " + 5 % 2);
		/*
		24. What is 1,000,000,000 * 3?
		*/
		System.out.println("1,000,000,000 * 3 " + 1000000000 * 3);
		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		boolean doneWithExercises = false;
		/*
		26. Now set doneWithExercise to true.
		*/
		doneWithExercises = true;
		/*
		26. What happens when you divide by 0.
		if int - exception
		if double - Infinity
		*/
		double num = 1.0 / 0;
		System.out.println("num is " + num);
		num += 1;
		System.out.println("num+1 is " + num);
		
	}

}
