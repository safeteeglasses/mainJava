package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.model.park.Park;
import com.techelevator.model.park.ParkDAO;

@Controller
public class ParkListController {

@Autowired	
private ParkDAO aParkDao;
	
	@RequestMapping(path="parkList")
	public String showParkList(ModelMap parkMap) { // give me a ModelMap to share data with view
		List<Park> parks = aParkDao.getAllParks(); 
		parkMap.addAttribute("parks", parks);// share the data with the View
		return "parkList";
	}
	
}
