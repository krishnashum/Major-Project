package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FacultypwdController 
{
	@RequestMapping("/fcp")
	public String display()
	{
		return "fcp";
	}
}
