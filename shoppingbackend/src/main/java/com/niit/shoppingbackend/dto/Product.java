package com.niit.shoppingbackend.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable {
	private static final long serialVersionUID=67785L;
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY  )
private int id;
private String name;
private int price;
private boolean enable=true;

private String address;


public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean isEnable() {
	return enable;
}
public void setEnable(boolean enable) {
	this.enable = enable;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", enable=" + enable + ", address=" + address
			+ "]";
}


}
