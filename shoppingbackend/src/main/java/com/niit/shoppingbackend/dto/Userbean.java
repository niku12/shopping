package com.niit.shoppingbackend.dto;

import java.io.Serializable;

public class Userbean implements Serializable {
private static final long serialVersionUID=123456L;
private User user;
private Address address;
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

	
	
}
