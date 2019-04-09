package com.daoapi;

import java.util.List;

import com.entities.Admin;

public interface AdminDao 
{
	public boolean saveOrUpdate(Admin admin);
	public List<Admin> list();
	public boolean delete(Admin admin);
}
