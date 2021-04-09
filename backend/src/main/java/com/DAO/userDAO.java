package com.DAO;

import java.util.List;

import com.models.user;

public interface userDAO {
	
	public boolean getUserByEmailAndPassword(String email,String password);
	
	public user getByID(int Id);
	
	public boolean getUserbyUserNameAndPassword(String userName,String email,String password);
	
	public List<user> getAll();

}
