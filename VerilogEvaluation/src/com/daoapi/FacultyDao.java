package com.daoapi;

import java.util.List;

import com.entities.Faculty;

public interface FacultyDao 
{
	public boolean saveOrUpdate(Faculty faculty);
	public List<Faculty> list();
	public boolean delete(Faculty faculty);
}
