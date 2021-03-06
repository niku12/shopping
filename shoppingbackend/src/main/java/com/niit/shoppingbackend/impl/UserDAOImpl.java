package com.niit.shoppingbackend.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.UserDAO;
import com.niit.shoppingbackend.dto.User;
@Repository("userDAO")

public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionfactory;
	
	private static List<User> useres=new ArrayList<>();  
    
    static{
    	User user=new User();
    	user.setUid(1);
    	user.setName("abc");
    	user.setRole("supplier");
    	
    	useres.add(user);
    	
    	
    }

	@Override
	@Transactional
	public boolean add(User user) {
		try{
			
		sessionfactory.getCurrentSession().persist(user);
			
		 return true;	
		}catch(Exception e){e.printStackTrace();}
		return false;
	}

	@Override
	@Transactional
	public List<User> list() {
		String selectactive="from User where enable = :enable";
		Query query= sessionfactory.getCurrentSession().createQuery(selectactive);
		query.setParameter("enable", true);
		
		return query.getResultList();
	}

	@Override
	@Transactional
	public User get(int id) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().get(User.class, Integer.valueOf(id));
	}

	@Override
	@Transactional
	public boolean update(User user) {
		try{
			
			sessionfactory.getCurrentSession().saveOrUpdate(user);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;

	}

	@Override
	@Transactional
	public boolean delete(User user) {
		user.setEnable(false);
		try{
			
			sessionfactory.getCurrentSession().update(user);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;

	}

	@Override
	@Transactional
	public User getuserbyname(String name) {
	//	Query query= sessionfactory.getCurrentSession().createQuery("FROM User WHERE name=:name");
//		query.setParameter("username",name );
	//User users=(User)	query.getSingleResult();
	String sele="FROM User WHERE name= :name";
	return sessionfactory.getCurrentSession().createQuery(sele,User.class).setParameter("name",name).getSingleResult();
		
		
		
		
	}

	
}
