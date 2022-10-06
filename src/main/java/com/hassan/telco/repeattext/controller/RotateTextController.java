package com.hassan.telco.repeattext.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RotateTextController
{
	private static final Logger logger = LoggerFactory
			.getLogger(RotateTextController.class);
	
	@GetMapping("/")
	public String homeMessage(
			@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model)
	{
		logger.debug("Calling Home Page using name = " + name);
		
		model.addAttribute("name", name);
		
		return "index";
	}
	
	@GetMapping("/rotatetext")
	public String rotateText(
			@RequestParam(name = "text", required = false, defaultValue = "This Text will keep changing!") String text,
			Model model)
	{
		logger.debug("Calling RotateText with : " + text);
		
		if (text != null && !text.isEmpty())
		{
			model.addAttribute("text", text);
		}
		
		return "rotatetext";
	}
	
}