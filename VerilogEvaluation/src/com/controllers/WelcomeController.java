package com.controllers;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Admin;
import com.entities.Faculty;
import com.servicesapi.AdminService;
import java.util.HashMap;

@Controller
public class WelcomeController 
{

	@Autowired
	AdminService adminServices;
	
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String display(HttpServletRequest req, Model m)
	{
		List<Admin> list = adminServices.list();
		
		String usrname = req.getParameter("usrname");
		String pwd = req.getParameter("pwd");
		Iterator<Admin> itr = list.iterator();
	     while(itr.hasNext()) 
	     {
	    	 Admin el=itr.next();
	    	 String st1=el.getA_username();
	    	 String st2=el.getA_pwd();
	         st1.equals(usrname);
	         st2.equals(pwd);
	         return "Welcomea";
	     }
		String msg="Enter correct Username or Password";
		m.addAttribute("message", msg);
		return "errorpage";
	}
}
