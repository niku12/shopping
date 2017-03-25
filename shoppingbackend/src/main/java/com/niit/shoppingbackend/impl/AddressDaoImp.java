package com.niit.shoppingbackend.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.AddressDao;
import com.niit.shoppingbackend.dto.Address;
import com.niit.shoppingbackend.dto.User;

@Repository("addressDao")
@Transactional
public class AddressDaoImp implements AddressDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public boolean add(Address address) {
		try{
			sessionfactory.getCurrentSession().save(address);   
		 return true;	
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<Address> list() {
	String sel="from Address";
	Query query= sessionfactory.getCurrentSession().createQuery(sel);	
		return query.getResultList();
	}

	@Override
	public  Address get(int id) {
	
		
		
		
		
		return sessionfactory.getCurrentSession().get(Address.class,  Integer.valueOf(id));
	}

	@Override
	public boolean update(Address address) {
		
		try{
			sessionfactory.getCurrentSession().update(address);   
		 return true;	
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		

	}

	@Override
	public boolean delete(Address address) {
		try{
			sessionfactory.getCurrentSession().delete(address);;   
		 return true;	
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	
	}

	@Override
	public List<Address> getAddress(User user) {
		// TODO Auto-generated method stub
	Query q=	sessionfactory.getCurrentSession().createQuery("From Address Where User_id=:id");
	q.setParameter("id", user.getUid());
		return q.getResultList();
	}

}
