package com.daoimpl;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.daoapi.AdminDao;
import com.entities.Admin;

@Repository
@Transactional
public class AdminImpl implements AdminDao 
{
	@Autowired
	SessionFactory session;
	public boolean saveOrUpdate(Admin admin) 
	{
		session.getCurrentSession().saveOrUpdate(admin);
		return true;
	}
	public List<Admin> list()
	{
		return session.getCurrentSession().createQuery("from Admin").list();
	}
	public boolean delete(Admin admin) 
	{
		try
		{
			session.getCurrentSession().delete(admin);
		}
		catch(Exception ex)
		{
			return false;
		}
		
		return true;
	}
}