package com.niit.shoppingbackend.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.CartItemDAO;
import com.niit.shoppingbackend.dto.CartItems;

@Repository("cartitemdao")
@Transactional
public class CartItemImpDAO implements CartItemDAO{
	@Autowired
	SessionFactory sessionfactory;
    public CartItemImpDAO(SessionFactory sessionfactory){
    	this.sessionfactory=sessionfactory;
    }
	@Override
	public boolean save(CartItems cartitem) {
		try{
			sessionfactory.getCurrentSession().save(cartitem);
			return true;
		}catch(HibernateException e){
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean update(CartItems cartitems) {
		
		sessionfactory.getCurrentSession().update(cartitems);
		return false;
	}
	@Override
	public boolean delete(CartItems cartitems) {
try{
			
			sessionfactory.getCurrentSession().delete(cartitems);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;

		
	}
	@Override
	public CartItems get(int id) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().get(CartItems.class, Integer.valueOf(id));
	}
	@Override
	public List<CartItems> list() {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().createQuery("from CartItems",CartItems.class).list();
	}
	
}
