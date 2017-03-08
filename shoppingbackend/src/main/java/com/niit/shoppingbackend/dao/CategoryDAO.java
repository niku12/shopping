package com.niit.shoppingbackend.dao;

import java.util.List;

import com.niit.shoppingbackend.dto.Category;


public interface CategoryDAO { 
	boolean add(Category category);
	List<Category> list();
	Category get(int id);
	public void edit(Category category);
	public void delete(int id);
	public List getAllCategory();
	boolean delete(Category category);
	boolean update(Category category);
	public Category getCategory(int id);
	List getAllCategory(int id);

}
