package com.servicesapi;

import java.util.List;

import com.entities.Admin;

public interface AdminService 
{
	public boolean saveOrUpdate(Admin admin);
	public List<Admin> list();
	public boolean delete(Admin admin);
}
