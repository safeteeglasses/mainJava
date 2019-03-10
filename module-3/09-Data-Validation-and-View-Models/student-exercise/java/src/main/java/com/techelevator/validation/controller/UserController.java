package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;




@Controller
public class UserController {
	// GET: /
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}
	
	
	
	
	
	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String showRegisterForm(Model modelHolder) {
		if( ! modelHolder.containsAttribute("Registration")) {
			modelHolder.addAttribute("Registration", new Registration());
		}
		return "register";
	}
	
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String submitRegisterForm(
			@Valid @ModelAttribute("Registration") Registration registerFormValues,
			
			BindingResult result,		//object to hold the result of validation
			RedirectAttributes flash	//define a flash object (exist only for the next request)
	){
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "Registration", result);
			flash.addFlashAttribute("Registration", registerFormValues);
			return "redirect:/register";
		}
		
		flash.addFlashAttribute("message", "You have successfully registered.");
		
		return "redirect:/confirmation";
	}
	
	
	
	
	@RequestMapping(path="/confirmation", method=RequestMethod.GET)
	public String showConfirmationView() {
		return "confirmation";
	}
	
	
	
	
	
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String showLoginForm(Model modelHolder) {
		if( ! modelHolder.containsAttribute("Login")) {
			modelHolder.addAttribute("Login", new Login());
		}
		return "login";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String submitLoginForm(
			@Valid @ModelAttribute("Login") Login registerFormValues,
			
			BindingResult result,		//object to hold the result of validation
			RedirectAttributes flash	//define a flash object (exist only for the next request)
	){
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "Login", result);
			flash.addFlashAttribute("Login", registerFormValues);
			return "redirect:/login";
		}
		
		flash.addFlashAttribute("message", "You have successfully registered.");
		
		return "redirect:/loginconfirmation";
	}
	@RequestMapping(path="/loginconfirmation", method=RequestMethod.GET)
	public String showLoginConfirmationPage() {
		return "loginconfirmation";
	}
	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	// GET: /login
	// Return the empty login view

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)

	// GET: /confirmation
	// Return the confirmation view
}
