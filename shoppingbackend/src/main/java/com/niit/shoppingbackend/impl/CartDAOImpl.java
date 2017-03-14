package com.niit.shoppingbackend.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.CartDAO;
import com.niit.shoppingbackend.dto.Cart;

@Repository("cartdao")
@Transactional
public class CartDAOImpl implements CartDAO	 {
    @Autowired
	SessionFactory sessionfactory;
    public CartDAOImpl(SessionFactory sessionfactory){
    	try{
    	
    	this.sessionfactory=sessionfactory;
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
	
	@Override
	public boolean save(Cart cart) {
		try{
			sessionfactory.getCurrentSession().save(cart);
			return true;
		}catch(HibernateException e){
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean update(Cart cart) {
		sessionfactory.getCurrentSession().update(cart);
		return false;	
	
	}

	@Override
	public boolean delete(Cart cart) {
		
		
		try{
			
			sessionfactory.getCurrentSession().delete(cart);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;
}

	@Override
	public Cart get(int id) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().get(Cart.class, Integer.valueOf(id));
	}

	@Override
	public List<Cart> list() {
	  
			
		return sessionfactory.getCurrentSession().createQuery("from Cart",Cart.class).list();
		 
	}
		
	}

