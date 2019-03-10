package com.techelevator.validation.model;

import java.sql.Date;
import java.time.LocalDate;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Registration {
	
	@NotBlank(message="First name is required") 
	@Size(max=20, message="What a crazy long name! Try to shorten it up a bit")
	private String firstName;
	
	@NotBlank(message="Last name is required")
	@Size(max=20, message="Wow and a equally long last name, same drill shorten it up")
	private String lastName;
	
	@NotBlank(message="Email address is required")
	@Email(message="Email must be a valid email address")
	private String email;
	
	@NotBlank(message="Verify email address is required")
	private String verifyEmail;
	
	@NotBlank(message="Password is required")
	@Size(min=8, message="Password must be at least 8 characters")
	private String password;
	
	@NotBlank(message="Password does not match")
	private String verifyPassword;
	
	@Past(message="You were not born in the future")
	private Date birthday;
	
	@Min(value=1, message="You have to atleast go by yourself")
	@Max(value=10, message="You can only purchase up to 10 tickets")
	private Integer tickets;
	
	@SuppressWarnings("unused")
	private boolean emailMatching; // Dummy property to get matching vaildation working
	@AssertTrue(message="Emails must match")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(verifyEmail);
		} else {
			return false;
		}
	}
	
	@SuppressWarnings("unused")
	private boolean passwordMatching; // Dummy property to get matching vaildation working
	@AssertTrue(message="Passwords must match")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(verifyPassword);
		} else {
			return false;
		}
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the verifyEmail
	 */
	public String getVerifyEmail() {
		return verifyEmail;
	}
	/**
	 * @param verifyEmail the verifyEmail to set
	 */
	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the verifyPassword
	 */
	public String getVerifyPassword() {
		return verifyPassword;
	}
	/**
	 * @param verifyPassword the verifyPassword to set
	 */
	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the tickets
	 */
	public Integer getTickets() {
		return tickets;
	}
	/**
	 * @param tickets the tickets to set
	 */
	public void setTickets(Integer tickets) {
		this.tickets = tickets;
	}
	/**
	 * @param emailMatching the emailMatching to set
	 */
	public void setEmailMatching(boolean emailMatching) {
		this.emailMatching = emailMatching;
	}
	/**
	 * @param passwordMatching the passwordMatching to set
	 */
	public void setPasswordMatching(boolean passwordMatching) {
		this.passwordMatching = passwordMatching;
	}
	
	
	

}
