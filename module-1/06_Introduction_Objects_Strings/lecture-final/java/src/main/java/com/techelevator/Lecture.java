package com.techelevator;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");
		
		/* The String class gets special treatment in the Java language.  One 
		 * example of this is that there is a literal representation of a 
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */
		
		String greeting = "Hello, World!";  // creates a new instance of String using a literal
		System.out.println("greeting : "+greeting);
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
		
		/* Below are examples of calling various String methods */
		
		System.out.println("***** charAt *****");
		
		String name = "Lincoln";
		char first = name.charAt(0);   // 'L'
		char fourth = name.charAt(3);  // 'c'
<<<<<<< HEAD
=======
		
>>>>>>> 137310b3ea743820f40657890ff4ce7583ca5e07
		System.out.println(name);
		System.out.println(first);
		System.out.println(fourth);
		
		
		System.out.println("***** contains *****");
		String hello = "Hello World!";
		System.out.println("hello : "+hello);
		boolean containsHello = hello.contains("Hello");
		System.out.println("containsHello : "+containsHello);
		boolean containsBogus = hello.contains("bogus");
		System.out.println("containsBogus : "+containsBogus);
		
		System.out.println("ends with: " + name.endsWith("e"));
		System.out.println( "Chars 6-11: " + hello.substring(6, 11));
		
		String city = "Cleveland           ";
		System.out.println("tell me how long city is: " + city.length());
		System.out.println("tell me how long city is after trim: " + city.trim().length());
		/* Other commonly used methods:
		 * 
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */
		
		System.out.println("ends with lo : "+hello.endsWith("lo"));
		System.out.println("start with H : "+hello.startsWith("H"));
		System.out.println("where is the e: "+hello.indexOf("e"));
		System.out.println("where is the l: "+hello.indexOf("l"));
		System.out.println("where is the last l: "+hello.lastIndexOf("l"));
		System.out.println("# chars is: "+hello.length());
		System.out.println("substring(6,11): "+hello.substring(6, hello.length()-1));
		
		String city = "Cleveland             ";
		System.out.println("# chars is: "+city.length());
		System.out.println("# chars (trimmed) is: "+city.trim().length());
		
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();
		
<<<<<<< HEAD
		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' }; //char literal is in ' '
=======
		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };  // char literal is enclosed in aposts
>>>>>>> 137310b3ea743820f40657890ff4ce7583ca5e07
		String hello1 = new String(helloArray);
		String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if(hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1+" is not equal to "+hello2);
		}
		
		String hello3 = hello1;
		if(hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}
		
		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		
		if(hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1+" is not equal to "+hello2);
		}
		
<<<<<<< HEAD
		String aLine = new String();
		Scanner keyBoard = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Enter three integers seperated by spaces: ");
		aLine = keyBoard.nextLine();
		System.out.println("You entered : " + aLine);
		
		String[] numsAsStrings = aLine.split(" ");
		
		for(int i = 0; i < numsAsStrings.length; i++) {
			sum += Integer.parseInt(numsAsStrings[i]);
		}
		System.out.println("Sum of values is: " + sum);
=======
		/* Use the split() to process multiple values
		 * entered from the keyboard
		 */	
		
		String aLine = new String();           // String to hold line from keyboard
		Scanner kb = new Scanner(System.in);   // object to represent the keyboard
		int sum = 0;                           // sum of the numbers
		
		System.out.println("Enter three integers separated by commas : ");
		aLine = kb.nextLine();
		System.out.println("You entered: " + aLine);    // get a line from the keyboard
		
		String[] numsAsStrings = aLine.split(",");      // split the sections of the line based on comma
		                                                // split() returns an array of String with each
		                                                // element a section of the String between commas
		
		for(int i = 0; i < numsAsStrings.length; i++) { // loop through the String array of values produced by .split()
			sum += Integer.parseInt(numsAsStrings[i]);  // convert the curremt element to an int and add to sum
		}
		System.out.println("Sum of values is: " + sum); // display the value in sm
		
		
>>>>>>> 137310b3ea743820f40657890ff4ce7583ca5e07
		
	}
}
