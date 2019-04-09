package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RemovefacultyController 
{
	@RequestMapping("/rf")
	public String display()
	{
		return "rf";
	}
}
