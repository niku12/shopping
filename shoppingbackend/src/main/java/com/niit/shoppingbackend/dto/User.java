package com.niit.shoppingbackend.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.NotBlank;
@Entity
public class User implements Serializable{
	private static final long serialVersionUID=67783L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY  )
	@Column
	private int uid;
	@NotBlank(message="Please enter name")
	private String name;
	@NotBlank(message="Please enter password")
	private String password;
	
	private String role="customer";
	boolean enable=true;
	//public String Address;
	
	
  @OneToMany(cascade = CascadeType.PERSIST, mappedBy="user",fetch=FetchType.LAZY)
   private Set<Address> addresslist=new HashSet<>();
	   
	
	
	public Set<Address> getAddresslist() {
	return addresslist;
}
public void setAddresslist(Set<Address> addresslist) {
	this.addresslist = addresslist;
}
	@OneToOne(cascade=CascadeType.ALL,mappedBy="user",fetch=FetchType.EAGER)
	private Cart cart;
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	/*public void setAddresslist(Set<Address> addresslist) {
		this.addresslist = addresslist;
	}*/
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
/*	public Collection<Address> getAddresslist() {
		return addresslist;
	}*/
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", password=" + password + ", role=" + role + ", enable="
				+ enable + ", addresslist=" + addresslist + ", cart=" + cart + "]";
	}
	
	
	
	
}
