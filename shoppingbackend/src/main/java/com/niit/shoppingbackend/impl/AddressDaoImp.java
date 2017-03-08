package com.niit.shoppingbackend.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingbackend.dao.AddressDao;
import com.niit.shoppingbackend.dto.Address;
import com.niit.shoppingbackend.dto.User;

@Repository("addressdao")
public class AddressDaoImp implements AddressDao {

	@Override
	public boolean add(Address address) {
		try{
			
		}catch(Exception e){
			
		}
		return false;
	}

	@Override
	public List<Address> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Address address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Address address) {
		// TODO Auto-generated method stub
		return false;
	}

}
