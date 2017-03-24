package com.niit.shoppingbackend.impl;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.CartDAO;
import com.niit.shoppingbackend.dao.OrderDAO;
import com.niit.shoppingbackend.dto.Cart;
import com.niit.shoppingbackend.dto.Order;

@Repository("orderdao")
@Transactional
public class OrderDAOImpl implements OrderDAO	 {
    @Autowired
	SessionFactory sessionfactory;
    public OrderDAOImpl(SessionFactory sessionfactory){
    	try{
    	
    	this.sessionfactory=sessionfactory;
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
	
	public boolean save(Order cart) {
		try{
			sessionfactory.getCurrentSession().save(cart);
			return true;
		}catch(HibernateException e){
			e.printStackTrace();
			return false;
		}
		
	}

	
	public boolean update(Order cart) {
		sessionfactory.getCurrentSession().update(cart);
		return false;	
	
	}


	public boolean delete(Order cart) {
		
		
		try{
			
			sessionfactory.getCurrentSession().delete(cart);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;
}

	
	public Order get(int id) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().get(Order.class, Integer.valueOf(id));
	}

	
	public List<Order> list() {
	  
			
		return sessionfactory.getCurrentSession().createQuery("from Order",Order.class).list();
		 
	}
		
	}


