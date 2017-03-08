package com.niit.shoppingend.service;

import java.util.List;

import com.niit.shoppingbackend.dto.Category;

public interface CategoryService {
	public void add(Category category);
	public void edit(Category category);
	public void delete(int id);
  public Category getCategory(int id);
  public List getAllCategory();
}
