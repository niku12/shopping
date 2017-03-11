package com.niit.shopping2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.niit.shoppingbackend.dao.UserDAO;
import com.niit.shoppingbackend.dto.Address;
import com.niit.shoppingbackend.dto.User;

@Component
public class RegisterHandler {
	
	@Autowired
	private UserDAO userDAO;
	/*public RegisterModel initFlow(){
		return new RegisterModel();
	}*/
	private Address add1;
	private Address add2;
	
	public RegisterHandler(){
		add1=new Address();
		add2=new Address();
	}
	
	
	public void saveUser(RegisterModel registerModel){
		User user=registerModel.getUser();
		//set the user
		userDAO.add(user);
	//	Address billing=registerModel.getBilling();
		//set the user
		//billing.setUser(user);
		
		
	}
	
	public User initFlow()
	{
		return new User();
	}
	public String validateDetails(User user,MessageContext messageContext){
		boolean status;
		try{
			userDAO.add(user);
			status=true;
		}catch(Exception e){
			status=false;
		}
		
		
		if(user.getName().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"userId").defaultText("UserId cannot be Empty").build());
			status = false;
		}
		if(user.getPassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = false;
		}
		
	   if(user.getRole().isEmpty()){
		   messageContext.addMessage(new MessageBuilder().error().source(
					"userId").defaultText("UserId cannot be Empty").build());
			status = false;
	   }
	   if(status==true){
		   return "success";}
		   else {
			   return 
					   "failure";}
				   
	   }
	

	public String validateD(Address address,MessageContext messageContext){
		boolean status = true;
		if(address.getBilling().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"userId").defaultText("UserId cannot be Empty").build());
			status = false;
		}
		if(address.getCity().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = false;
		}
		if(status==true){
		return "success";}
		else{
			return "failure";
		}
	   	
		
	}
	
	}
