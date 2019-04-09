package com.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoapi.AdminDao;
import com.entities.Admin;
import com.servicesapi.AdminService;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	AdminDao adminDao;
	
	public boolean saveOrUpdate(Admin admin) 
	{
		return adminDao.saveOrUpdate(admin);
	}

	public List<Admin> list() 
	{
		return adminDao.list();
	}

	public boolean delete(Admin admin) 
	{
		return adminDao.delete(admin);
	}	
	
}
