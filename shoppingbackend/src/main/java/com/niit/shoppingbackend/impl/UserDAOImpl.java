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
@Transactional(noRollbackFor = Exception.class)

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
	
	public boolean add(User user) {
		try{
			
		sessionfactory.getCurrentSession().save(user);	
			
		 return true;	
		}catch(Exception e){e.printStackTrace();}
		return false;
	}

	@Override
	public List<User> list() {
		String selectactive="from User where enable = :enable";
		Query query= sessionfactory.getCurrentSession().createQuery(selectactive);
		query.setParameter("enable", true);
		
		return query.getResultList();
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession().get(User.class, Integer.valueOf(id));
	}

	@Override
	public boolean update(User user) {
		try{
			
			sessionfactory.getCurrentSession().persist(user);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;

	}

	@Override
	public boolean delete(User user) {
		user.setEnable(false);
		try{
			
			sessionfactory.getCurrentSession().update(user);	
				
			 return true;	
			}catch(Exception e){e.printStackTrace();}
			return false;

	}
}
