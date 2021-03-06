package com.udemy.bakendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class RecibePetGet1 {
	
	//localhost:8080/example2/request1?nm=Pedro
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm", required=false, defaultValue="NULL") String name) {
		ModelAndView mav = new ModelAndView("recibePetGet");
		mav.addObject("nm_in_model", name);
		return mav;
	}

}
