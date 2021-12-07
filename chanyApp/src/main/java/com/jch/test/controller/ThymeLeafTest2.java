package com.jch.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class ThymeLeafTest2 {
	
//	@RequestMapping("/{number}")
//	public String index(@PathVariable int number, Model model) {
//		
//		model.addAttribute("pow", number * number);
//		
//		return "index";
//	}
	
	@RequestMapping("/{number}")
	public ModelAndView index(@PathVariable int number, ModelAndView mav) {
		
		mav.addObject("pow", number * number);
		mav.setViewName("powTemplate2");
		
		return mav;
	}

}
