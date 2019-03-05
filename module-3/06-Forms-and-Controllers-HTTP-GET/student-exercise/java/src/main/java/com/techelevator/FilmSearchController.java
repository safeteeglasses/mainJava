package com.techelevator;

import com.techelevator.dao.FilmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;

    @RequestMapping("/filmSearch")
    public String showFilmSearchForm() {
        return "filmList";
    }

    @RequestMapping(path="/filmList", method=RequestMethod.GET)
    public String searchFilms(@RequestParam String minLength, String maxLength, String genre, ModelMap model) {
    							model.put("films", filmDao.getFilmsBetween
    									(genre, Integer.parseInt(minLength), 
    											Integer.parseInt(maxLength))); 
        return "filmList";
    }
    
    
}