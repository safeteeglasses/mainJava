package com.techelevator.validation.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class SignUp {
	
	@NotBlank(message="Name is required")   // message is optional
	private String name;
	
	@NotBlank(message="Email address is required")
	@Email(message="Email must be a valid email address")  // validate the format of email NOT That is a real one
	private String email;
	
	@NotBlank(message="Verify email address is required")
	private String verifyEmail;
	
	@Pattern(regexp="^\\(\\d{3}\\)\\d{3}-\\d{4}$", message="Please enter a valid, ten digit phone number")
	private String phone;
	
	private String occupation;
	
	@Min(value=13, message="You must be 13 years old or older")
	@Max(value=150, message="You're not that old!")
	private Integer age;
	
	@SuppressWarnings("unused")
	private boolean emailMatching; // Dummy property to get matching vaildation working
	@AssertTrue(message="Emails must match")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(verifyEmail);  // return true or false
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
