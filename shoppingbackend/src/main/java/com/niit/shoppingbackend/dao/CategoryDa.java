package com.niit.shoppingbackend.dao;

import java.util.List;

import com.niit.shoppingbackend.dto.Category;

public interface CategoryDa {
	public void add(Category category);
	public void edit(Category category);
	public void delete(int id);
  public Category getCategory(int id);
  public List<?> getAllCategory();	  
}
