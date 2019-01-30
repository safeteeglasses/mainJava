package com.techelevator;

public class testPolyApp {

	public static void main(String[] args) {
		
		Worker anHourly   = new HourlyWorker("Our","Lee", 20);
		Worker aSalary    = new SalaryWorker("Sal","O'Ree", 60000);
		Worker aVolunteer = new VolunteerWorker("Val","Entere");
//		Worker aWorker    = new Worker("Werk", "Kerr");  // cannot instantiate an abstract class
		
		showTest(anHourly  , 50);   // expecting 1100
		showTest(aSalary   , 50);   // expecting 1153.85
		showTest(aVolunteer, 50);   // expecting 0
//		showTest(aWorker   , 50);   // expecting -1
		System.out.println("-------------------------------------------------------------");
		
		showTest(anHourly  , 40);   // expecting 800
		showTest(aSalary   , 40);   // expecting 1153.85
		showTest(aVolunteer, 40);   // expecting 0
//		showTest(aWorker   , 40);   // expecting -1
		System.out.println("-------------------------------------------------------------");
		
		showTest(anHourly  , 30);   // expecting 600
		showTest(aSalary   , 30);   // expecting 1153.85
		showTest(aVolunteer, 30);   // expecting 0
//		showTest(aWorker   , 50);   // expecting -1
		System.out.println("-------------------------------------------------------------");
		
	}
	public static void showTest(Worker aWorker, int hoursWorked) {		

		System.out.printf("%-5s %-10s working for %d hours makes $%8.2f per week\n", 
		                 aWorker.getFirstName(),   // replace the 1st placeholder in the mode
		                 aWorker.getLastName(),    // replace the 2nd placeholder in the model
		                 hoursWorked,              // replace the 3rd placeholder in the model
		                 aWorker.calculateWeeklyPay(hoursWorked));   // replace the 4th placeholder in the mode
		
	}
}
