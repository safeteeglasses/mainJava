package com.techelevator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.commons.dbcp2.BasicDataSource;

public class SQLInjectExample {
//******************************************************************************
// This program is used to demonstrate SQL am technique that is susceptible
// to SQL injection attacks vs an SQL techniques that guard against them
//  |--------------------|
//  |   users table      |
//  |--------------------|
//  | userid | password  |
//  |--------------------|
//  | Vinny  | mycousin  |
//  |--------------------|
//  | Vito   | godfather |
//  |--------------------|
//  | frank  | java      |
//  |--------------------|
//******************************************************************************
	
	public static void main(String[] args) throws SQLException {

// Define data source                                              
		@SuppressWarnings("resource")
		BasicDataSource userLoginSource = new BasicDataSource();
		userLoginSource.setUrl("jdbc:postgresql://localhost:5432/users");
		userLoginSource.setUsername("postgres");
		userLoginSource.setPassword("postgres1");

// Define a Connection to the data source                                               
		Connection conn = userLoginSource.getConnection();

// Create a Statement object for the Connection so that we can execute a SQL Query */
		Statement stmt = conn.createStatement();					
				
// Get user login credentials       
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter userid: ");
		String inUserid = keyboard.nextLine();
		System.out.println("Please enter password: ");
		String inPassword = keyboard.nextLine();
		
//******************************************************************************
// Determine if userid/password combination is valid with an SQL Query
// using concatenated parameters
//******************************************************************************

		System.out.println("----------------------------------------------------------");
        System.out.println("Using values entered by concatenating in SQL WHERE:");

// Define  String containing the SQL statement - concatenating user entered values
		String getLogin =  "SELECT true "                        +
				       	     "FROM user_logins "                 +
					        "WHERE userid   = '"+inUserid  +"' " +
					          "AND password = '"+inPassword+"' " ;

// Display the SQL statement with concatenated user entered values
		System.out.println("\n"+getLogin+"\n");

// Execute SQL using the String created containing the SQL query		
		ResultSet results = stmt.executeQuery(getLogin);

// Check for valid login credentials
		checkForValidLogin(results);

///******************************************************************************
// Determine if userid/password combination is valid with an SQL Query
// using parameter markers
//******************************************************************************
        System.out.println("----------------------------------------------------------");
		System.out.println("Using values entered using parameter markers in SQL WHERE:");
		
		String getLogin2 = "SELECT  true "        +
   	                         "FROM user_logins "  +
                            "WHERE userid = ? "   +
                              "AND password = ? " ;
		
		System.out.println("\n"+getLogin2+"\n");

// PreparedStatement objects are created using the Connection object
         PreparedStatement getLoginStmt = conn.prepareStatement(getLogin2);
         
// Assign values to the parameter markers                            
		 getLoginStmt.setString(1, inUserid);    // set the first ?  to the userid entered
         getLoginStmt.setString(2, inPassword);  // set the second ? to the password entered
                       		
// Call executeQuery to return the results as a ResultSet 
         results = getLoginStmt.executeQuery();
                
         checkForValidLogin(results);
         
         System.out.println("----------------------------------------------------------");
         
         return;
	}
	
public static void checkForValidLogin(ResultSet results) throws SQLException         
{
// if query returned a row a valid userid/password combo was found in the table
//  so send welcome message 
// otherwise an invalid userid/password combo was entered
//  so say "Good bye!"
	
		if (results.next()) {
  		  	    System.out.println("Welcome to your secret, ultra-sensitive data store!");
			    }
			    else {
				 	  System.out.println("Good bye!");
				}
}
}		
	



