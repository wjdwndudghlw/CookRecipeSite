package com.lee.project.Season;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.project.Guest.Guest;
import com.lee.project.Guest.GuestDAO;
import com.lee.project.User.User;

@Controller
public class Season_Controller {

	@Autowired
	private SeasonDAO  srDAO;

	public SeasonDAO srDAO() {
		return srDAO;
	}
	


	@RequestMapping(value = "/showDetailSeasonRecipe", method = RequestMethod.GET)
	public String showDetailSeasonRecipe(User u,Season season, HttpServletRequest req) {
		try {
			srDAO.getSeason_Recipe_Detail(u,season, req);
			req.setAttribute("cp", "SeasonDetailRecipe.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
}
