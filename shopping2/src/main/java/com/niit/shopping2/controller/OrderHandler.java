package com.niit.shopping2.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.niit.shoppingbackend.dao.UserDAO;
import com.niit.shoppingbackend.dto.Address;
import com.niit.shoppingbackend.dto.Cart;
import com.niit.shoppingbackend.dto.User;
@Component
public class OrderHandler {
	@Autowired
	private UserDAO userDAO;
	private Address add1;
	
	public OrderHandler(){
		 add1= new Address();
	}
	
	public Cart initFlow(String principle)
	{
		User user=userDAO.getuserbyname(principle);
		Cart cart=user.getCart();
		
		return cart;
	}
	public void saveAddress(Address address,String principle){
		
		User user=userDAO.getuserbyname(principle);
		//Address add=user.getAddresslist();
	
		
	}
	
	
	
	public String validateD(Address address,MessageContext messageContext){
		boolean status = true;
		if(address.getShipping().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"userId").defaultText("Shipping cannot be Empty").build());
			status = false;
		}
		if(address.getCity().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("City cannot be Empty").build());
			status = false;
		}
		if(status==true){
		return "success";}
		else{
			return "failure";
		}
	   	
		
	}
	
}
