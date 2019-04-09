package com.servicesapi;

import java.util.List;

import com.entities.Faculty;

public interface FacultyService 
{
	public boolean saveOrUpdate(Faculty faculty);
	public List<Faculty> list();
	public boolean delete(Faculty faculty);
}
