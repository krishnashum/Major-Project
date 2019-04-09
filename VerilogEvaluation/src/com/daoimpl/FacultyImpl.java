package com.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.daoapi.FacultyDao;
import com.entities.Faculty;

@Repository
@Transactional
public class FacultyImpl implements FacultyDao
{
	@Autowired
	SessionFactory session;
	
	public boolean saveOrUpdate(Faculty faculty)
	{
		session.getCurrentSession().saveOrUpdate(faculty);
		return true;	
	}
	public List<Faculty> list()
	{
		return session.getCurrentSession().createQuery("from Faculty").list();
	}
	public boolean delete(Faculty faculty) 
	{
		try
		{
			session.getCurrentSession().delete(faculty);
		}
		catch(Exception ex)
		{
			return false;
		}
		
		return true;
	}
}
