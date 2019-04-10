package com.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entities.Faculty;
import com.servicesapi.FacultyService;

@Controller
public class FacultyController 
{
//	@Autowired
//	FacultyService facultyServices;
	
	@RequestMapping(value="/fsaveOrUpdate", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getSaved(Faculty faculty)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		if(true)//facultyServices.saveOrUpdate(faculty))
		{
			map.put("status","200");
			map.put("message","Your record have been saved successfully");
		}
		return map;
	}


	@RequestMapping(value="/flist", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAll(Faculty faculty)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		List<Faculty> list = new ArrayList<>();//facultyServices.list();
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


	@RequestMapping(value="/fdelete", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> delete(Faculty faculty)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		if(true)//facultyServices.delete(faculty))
		{
			map.put("status","200");
			map.put("message","Your record have been deleted successfully");
		}
		return map;
	}
}
