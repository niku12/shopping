package com.niit.shoppingbackend.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.ProductDao;
import com.niit.shoppingbackend.dto.Product;
@Repository("productdao1")
@Transactional
public  class ProductDaoImpl implements ProductDao {
	
	@Autowired
	SessionFactory sessionfactory;
	public ProductDaoImpl(SessionFactory sessionfactory){
		
		try{
			this.sessionfactory=sessionfactory;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	
	public boolean save(Product product) {
		// TODO Auto-generated method stub
		try{
			sessionfactory.getCurrentSession().save(product);
			return true;
		}catch(HibernateException e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().update(product);
		return false;
	}

	@Override
	public boolean delete(Product product) {
		product.setEnable(false);;
		try{
			
			sessionfactory.getCurrentSession().update(product);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;
	}

	
	@Override
	public List<Product> list() {
		
		String selectactive="from Product where enable = :enable";
		Query query= sessionfactory.getCurrentSession().createQuery(selectactive);
		query.setParameter("enable", true);
		
		return query.getResultList();

	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().get(Product.class, Integer.valueOf(id));
	}

}
