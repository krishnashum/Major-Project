package com.controllers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entities.Admin;
import com.servicesapi.AdminService;

@Controller
public class AdminController 
{
	@Autowired
	AdminService adminServices;
	
	@RequestMapping(value="/asaveOrUpdate", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getSaved(Admin admin)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		
		if(adminServices.saveOrUpdate(admin))
		{
			map.put("status","200");
			map.put("message","Your record have been saved successfully");
		}
		
		return map;
	}
	
	@RequestMapping(value="/alist", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAll(Admin admin)
	{
		Map<String,Object> map = new HashMap<String,Object>();
			List<Admin> list = adminServices.list();
			if (list != null)
			{
				map.put("status","200");
				map.put("message","Data found");
				map.put("data", list);
			}
			else
			{
				map.put("status","404");
				map.put("message","Data not found");
				
			}
		return map;
	}
	
	@RequestMapping(value="/adelete", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> delete(Admin admin)
	{
		Map<String,Object> map = new HashMap<String,Object>();	
		if(adminServices.delete(admin))
		{
			map.put("status","200");
			map.put("message","Your record have been deleted successfully");
		}
		return map;
	}
}
