package com.springapp.mvc;

import com.springapp.dao.PollQuizDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    PollQuizDaoImpl pollQuizDao;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        model.addAttribute("entries", pollQuizDao.findAll());
		return "quiz";
	}
}