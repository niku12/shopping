package com.niit.shoppingbackend.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.CategoryDAO;
import com.niit.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class  CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Category> list() {
		String selectActiveCategory="FROM Category where active = :active";  
Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		
query.setParameter("active", true);
return query.getResultList();
	}

	@Override

	public boolean add(Category category) {
		// TODO Auto-generated method stub
		try {
	 		sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
	}
//getting a single category base on id
	@Override
	public Category get(int id) {
		// enhance for loop

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}
//add category to database
	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}

		
	}

	@Override
	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

			return false;
		}
 
		
	}

	@Override
	public void edit(Category category) {
		sessionFactory.getCurrentSession().update(category);
		
	}

	@Override
	public void delete(int id) {
		
		
	sessionFactory.getCurrentSession().delete(getCategory(id));
		
	}

	@Override
	public List getAllCategory(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllCategory() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}
    @Override
	public Category getCategory(int id) {
		
		return (Category)sessionFactory.getCurrentSession().get(Category.class, id);
	}

}
