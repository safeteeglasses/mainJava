package com.techelevator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class CampgroundMVC {

	

	@RequestMapping("/")
	public String showHomePage() {
		return "home";
	}
	
}
