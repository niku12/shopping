package com.niit.shoppingbackend.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY  )
	@Column
	private int uid;
	@NotNull
	private String name;
	@NotNull
	private String password;
	
	private String role;
	boolean enable=true;
	@OneToMany(cascade=CascadeType.ALL)
//	@JoinTable(joinColumns=@JoinColumn(name="aid"),inverseJoinColumns=@JoinColumn(name="uid"))
	private Collection<Address> addresslist=new ArrayList<>();
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Address> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(Collection<Address> addresslist) {
		this.addresslist = addresslist;
	}
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
				+ enable + ", addresslist=" + addresslist + "]";
	}
	
}
