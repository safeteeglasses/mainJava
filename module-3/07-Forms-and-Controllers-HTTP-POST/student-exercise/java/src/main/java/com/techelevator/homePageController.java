package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;




@Controller 
public class homePageController {
	
@Autowired
private ReviewDao reviewDao;
	
@RequestMapping("/")
public String displayHomePage() {
	return "homePage";
}

@RequestMapping("/reviewInput")
	public String reviewInputPage() {
		return "reviewInput";
}
@RequestMapping(path="/homePage", method=RequestMethod.POST)
public String processSpaceForumPost(@RequestParam String username,
									@RequestParam int rating,
									@RequestParam String title,
									@RequestParam String text)
									throws FileNotFoundException, IOException {
LocalDateTime now = LocalDateTime.now();
Review review = new Review();
review.setUsername(username);
review.setRating(rating);
review.setText(text);
review.setDateSubmitted(now);
review.setTitle(title);
reviewDao.save(review);
return "redirect:/homePage";
}

@RequestMapping(path="/homePage", method=RequestMethod.GET)
public String showForumOutput(HttpServletRequest request) {
	List<Review> allReviews = new ArrayList<>();
	allReviews = reviewDao.getAllReviews();
	request.setAttribute("reviews", allReviews);
	return "homePage";
}

}