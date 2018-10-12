package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tsteController {
	
	
	 @PostMapping("/Loin")
	public String getLoin(@ModelAttribute getLoin gitloin) {
		 System.out.println("aaaaaaa");
		System.out.println(gitloin.getId());
		
		return "Loin";
	
	}
	

	

}
