package com.techelevator.fbn.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.fbn.model.CheckingAccountApplication;

@Controller
@RequestMapping("/checkingApplication")
public class CheckingApplicationController {

	@RequestMapping(path={"/","/personalInformationInput"}, method=RequestMethod.GET)
	public String displayPersonalInformationInput() {
		return "checkingApplication/personalInformationInput";
	}

	@RequestMapping(path="/personalInformationInput", method=RequestMethod.POST)
	public String processPersonalInformationInput(@RequestParam String firstName,
												 @RequestParam String lastName,
												 @DateTimeFormat(pattern="MM/dd/yyyy")
												 @RequestParam LocalDate dateOfBirth,
												 @RequestParam String stateOfBirth,
												 @RequestParam String emailAddress,
												 @RequestParam String phoneNumber,
												 HttpSession session) {

		CheckingAccountApplication application = new CheckingAccountApplication();
		application.setFirstName(firstName);
		application.setLastName(lastName);
		application.setDateOfBirth(dateOfBirth);
		application.setStateOfBirth(stateOfBirth);
		application.setEmailAddress(emailAddress);
		application.setPhoneNumber(phoneNumber);

		session.setAttribute("customerApplication", application);

		return "redirect:/checkingApplication/addressInput";
	}

	@RequestMapping(path="/addressInput", method=RequestMethod.GET)
	public String displayAddressInput() {
		return "checkingApplication/addressInput";
	}

	@RequestMapping(path="/addressInput", method=RequestMethod.POST)
	public String processAddressInput(@RequestParam String streetAddress,
									 @RequestParam String apartmentNumber,
									 @RequestParam String city,
									 @RequestParam String state,
									 @RequestParam String zipCode,
									 HttpSession session) {

		CheckingAccountApplication application = (CheckingAccountApplication)session.getAttribute("customerApplication");

		application.setAddressStreet(streetAddress);
		application.setAddressApartment(apartmentNumber);
		application.setAddressCity(city);
		application.setAddressState(state);
		application.setAddressZip(zipCode);

		return "redirect:/checkingApplication/summary";
	}

	@RequestMapping(path="/summary", method=RequestMethod.GET)
	public String displaySummary() {
		return "checkingApplication/summary";
	}

	@RequestMapping(path="/completeApplication", method=RequestMethod.POST)
	public String processApplication(HttpSession session) {

		CheckingAccountApplication application = (CheckingAccountApplication)session.getAttribute("customerApplication");

		/* This is where we would do something useful with the application,
		 * such as save it to a database. */

		return "redirect:/checkingApplication/thankYou";
	}

	@RequestMapping(path="/thankYou", method=RequestMethod.GET)
	public String displayThankYou() {
		return "checkingApplication/thankYou";
	}
}
