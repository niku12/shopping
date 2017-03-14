 package com.niit.shoppingbackend.dao;

import java.util.List;

import com.niit.shoppingbackend.dto.Category;
import com.niit.shoppingbackend.dto.User;

public interface UserDAO {
	
	public boolean add(User user);
	 	 	
 public List<User>list();
 public User get(int id);
 public boolean update(User user);
 public boolean delete(User user);
 public User getuserbyname(String user);
 
  
 
}
