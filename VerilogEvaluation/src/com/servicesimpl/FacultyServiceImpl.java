package com.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoapi.FacultyDao;
import com.entities.Faculty;
import com.servicesapi.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService
{

	@Autowired
	FacultyDao facultyDao;
	
	public boolean saveOrUpdate(Faculty faculty) 
	{
		return facultyDao.saveOrUpdate(faculty);
	}

	public List<Faculty> list() 
	{
		return facultyDao.list();
	}

	public boolean delete(Faculty faculty) 
	{
		return facultyDao.delete(faculty);
	}
}