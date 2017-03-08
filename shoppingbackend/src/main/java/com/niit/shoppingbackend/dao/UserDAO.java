 package com.niit.shoppingbackend.dao;

import java.util.List;

import com.niit.shoppingbackend.dto.Category;
import com.niit.shoppingbackend.dto.User;

public interface UserDAO {
	
	public boolean add(User user);
	 	 	
 List<User>list();
 User get(int id);
 boolean update(User user);
 boolean delete(User user);
  
 
}
