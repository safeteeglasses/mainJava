package com.techelevator;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class JavaDateExample {

	public static void main(String[] args) {
		doBirthdayCalculationsUsingLegacyDateClasses();
		doBirthdayCalculationsUsingJava8Classes();
	}

	private static void doBirthdayCalculationsUsingLegacyDateClasses() {
//*******************************************************************************
// Demonstrate Date classes defined prior to Java 8 (before 3/8/2017)
//*******************************************************************************

// Define a Calendar object with the instant (year, month, day, hour, min, sec) that it was instantiated
		Calendar birthdayCal = Calendar.getInstance(); 

// Set the Calendar object to Java's generally accepted birthday
//		                year,   month     ,day, hr,mm,ss
		birthdayCal.set(1995, Calendar.MAY, 23, 0, 0, 0);
		
// Define a Date object with the instant (year, month, day, hour, min, sece) that it was instantiated
		Date today = new Date(); 

// Define a Calendar object and set it to the values in the Date object

		Calendar todayCal = Calendar.getInstance();
		todayCal.setTime(today);

// Extract the Month and Day from the Calendar objects	
		int birthdayMonth = birthdayCal.get(Calendar.MONTH);
		int birthdayDay = birthdayCal.get(Calendar.DAY_OF_MONTH);
		int todayMonth = todayCal.get(Calendar.MONTH);
		int todayDay = todayCal.get(Calendar.DAY_OF_MONTH);

// If today is Java's birthday, display a greeting
//   otherwise display how many days there are until Java's birthday
		if(birthdayMonth == todayMonth && birthdayDay == todayDay) {
			System.out.println("Happy Birthday Java!");
		} else {
			int birthdayDayOfYear = birthdayCal.get(Calendar.DAY_OF_YEAR);
			int todayDayOfYear = todayCal.get(Calendar.DAY_OF_YEAR);
			int daysUntilBirthday = birthdayDayOfYear - todayDayOfYear;
			if(daysUntilBirthday < 0) {
				daysUntilBirthday = 365 + daysUntilBirthday;
			}
			System.out.println(daysUntilBirthday+" days until Java's birthday!");
		}
	}
	
	private static void doBirthdayCalculationsUsingJava8Classes() {
//*******************************************************************************
// Demonstrate Date classes defined in Java 8 (3/8/2017)
//*******************************************************************************

// Set the Calendar object to Java's generally accepted birthday
		LocalDate javaBirthdate = LocalDate.of(1995, 5, 23);

// Extract the month from the LocalDate holding Java's birthday
		MonthDay javaBirthday = MonthDay.from(javaBirthdate);

// If today is Java's birthday, display a greeting
//   otherwise display how many days there are until Java's birthday 
		if(javaBirthday.equals(MonthDay.now())) {
			System.out.println("Happy Birthday Java!");
		} else {
			LocalDate today = LocalDate.now();
			long daysUntilBirthday = javaBirthdate.getDayOfYear() - today.getDayOfYear();
			if(daysUntilBirthday < 0) {
				daysUntilBirthday = 365 + daysUntilBirthday;
			}
			System.out.println(daysUntilBirthday+" days until Java's birthday!");
		}
	}	
}
