package com.niit.shoppingbackend.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.CartItemDAO;
import com.niit.shoppingbackend.dto.Cart;
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
	public List<CartItems> list(Cart cart) {
		// TODO Auto-generated method stub
				
List<CartItems> list = sessionfactory.getCurrentSession().createQuery("from CartItems where CART_ID = :id", CartItems.class).setParameter("id", cart.getId()).getResultList();
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
	public CartItems getCartItemWithCartAndProduct(int productid, int cartid) {
		// TODO Auto-generated method stub
		try{
		Query q=sessionfactory.getCurrentSession().createQuery("From CartItems where cart_id=:cartid and product_id=:proid");
		q.setParameter("cartid", cartid);
		q.setParameter("proid", productid);
		return (CartItems)q.getSingleResult();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}

		//return sessionfactory.getCurrentSession().createQuery("from CartItems",CartItems.class).list();
	}
	

