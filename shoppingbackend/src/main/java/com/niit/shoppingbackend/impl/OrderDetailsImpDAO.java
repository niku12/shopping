/*package com.niit.shoppingbackend.impl;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.CartItemDAO;
import com.niit.shoppingbackend.dao.OrderDetailsDAO;
import com.niit.shoppingbackend.dto.Cart;
import com.niit.shoppingbackend.dto.CartItems;
import com.niit.shoppingbackend.dto.Order;
import com.niit.shoppingbackend.dto.OrderDetails;

@Repository("orderdetaildao")
@Transactional
public class OrderDetailsImpDAO implements OrderDetailsDAO{
	@Autowired
	SessionFactory sessionfactory;
    public OrderDetailsImpDAO(SessionFactory sessionfactory){
    	this.sessionfactory=sessionfactory;
    }
	
	public boolean save(OrderDetails cartitem) {
		try{
			sessionfactory.getCurrentSession().save(cartitem);
			return true;
		}catch(HibernateException e){
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean update(OrderDetails cartitems) {
		
		sessionfactory.getCurrentSession().update(cartitems);
		return false;
	}
	@Override
	public boolean delete(OrderDetails cartitems) {
try{
			
			sessionfactory.getCurrentSession().delete(cartitems);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;

		
	}
	@Override
	public OrderDetails get(int id) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().get(OrderDetails.class, Integer.valueOf(id));
	}
	
	public List<OrderDetails> list(Order cart) {
		// TODO Auto-generated method stub
				
List<OrderDetails> list = sessionfactory.getCurrentSession().createQuery("from orderdetails where order_id = :id", OrderDetails.class).setParameter("id", Order.getId()).getResultList();
			return list;
		}
	@Override
	public void deletecartitemById(int id) {
		// TODO Auto-generated method stub
		CartItems cartitem=new CartItems();
		cartitem.setId(id);
		sessionfactory.getCurrentSession().delete(cartitem);
		
	}

	@Override
	public List<OrderDetails> list(OrderDetails orderdetails) {
		// TODO Auto-generated method stub
		return null;
	}

		//return sessionfactory.getCurrentSession().createQuery("from CartItems",CartItems.class).list();
	}
	

*/