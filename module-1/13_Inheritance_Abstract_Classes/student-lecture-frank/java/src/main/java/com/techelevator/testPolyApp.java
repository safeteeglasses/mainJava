package com.techelevator;

public class testPolyApp {

	public static void main(String[] args) {
		
		Worker anHourly   = new HourlyWorker("Our","Lee", 20);
		Worker aSalary    = new SalaryWorker("Sal","O'Ree", 60000);
		Worker aVolunteer = new VolunteerWorker("Val","Entere");
		Worker aWorker    = new Worker("Werk", "Kerr");
		
		showTest(anHourly  , 50);   // expecting 900
		showTest(aSalary   , 50);   // expecting 1153.85
		showTest(aVolunteer, 50);   // expecting 0
		showTest(aWorker   , 50);   // expecting -1
		System.out.println("-------------------------------------------------------------");
		
		showTest(anHourly  , 40);   // expecting 800
		showTest(aSalary   , 40);   // expecting 1153.85
		showTest(aVolunteer, 40);   // expecting 0
		showTest(aWorker   , 50);   // expecting -1
		System.out.println("-------------------------------------------------------------");
		
		showTest(anHourly  , 30);   // expecting 600
		showTest(aSalary   , 30);   // expecting 1153.85
		showTest(aVolunteer, 30);   // expecting 0
		showTest(aWorker   , 50);   // expecting -1
		System.out.println("-------------------------------------------------------------");
		
	}
	public static void showTest(Worker aWorker, int hoursWorked) {		

		System.out.printf("%s %s working for %d hours makes $%.2f per week\n", 
		                 aWorker.getFirstName(),
		                 aWorker.getLastName(),
		                 hoursWorked,
		                 aWorker.calculateWeeklyPay(hoursWorked));
		
	}
}
