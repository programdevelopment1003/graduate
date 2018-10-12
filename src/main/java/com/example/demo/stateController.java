package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class stateController {
	@RequestMapping("/")
	private ModelAndView index(ModelAndView mav) {
		mav.setViewName("Loin");
		return mav;
		
		}
	@ModelAttribute
	getLoin getloin() {
	    return new getLoin();
	}

}
