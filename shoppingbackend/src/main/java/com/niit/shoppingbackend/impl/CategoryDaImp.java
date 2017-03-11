 package com.niit.shoppingbackend.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.CategoryDa;
import com.niit.shoppingbackend.dto.Category;

@Repository("categoryDa")
@Transactional
public class CategoryDaImp implements CategoryDa{
   @Autowired
	private SessionFactory session;
	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(category);
	}

	@Override
	public void edit(Category category) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(category);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	session.getCurrentSession().delete(getCategory(id) );	
	}

	@Override
	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		return (Category)session.getCurrentSession().get(Category.class, id);
	}

	@Override
	public List getAllCategory() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Category").list();
	}

}
