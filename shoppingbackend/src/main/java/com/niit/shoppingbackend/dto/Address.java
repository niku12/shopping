package com.niit.shoppingbackend.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity 
public class Address implements Serializable {
	private static final long serialVersionUID=678L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int aid;
	String billing;
	String shipping;
	String city;
	String pin;
	@ManyToOne
	private User user;

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getBilling() {
		return billing;
	}
	public void setBilling(String billing) {
		this.billing = billing;
	}
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public User getUser() {
	return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", billing=" + billing + ", shipping=" + shipping + ", city=" + city + ", pin="
				+ pin + "]";
	}
	
	
}
