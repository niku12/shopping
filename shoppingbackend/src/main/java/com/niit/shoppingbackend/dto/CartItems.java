package com.niit.shoppingbackend.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class CartItems implements Serializable{
	public static final long serialVersionUID=67788L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;

@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private Cart cart;

private int quantity;

private float totalPrice;

@OneToOne(fetch=FetchType.EAGER)
private Category product;



public Category getProduct() {
	return product;
}



public void setProduct(Category product) {
	this.product = product;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public Cart getCart() {
	return cart;
}



public void setCart(Cart cart) {
	this.cart = cart;
}



public int getQuantity() {
	return quantity;
}



public void setQuantity(int quantity) {
	this.quantity = quantity;
}



public float getTotalPrice() {
	return totalPrice;
}



public void setTotalPrice(float totalPrice) {
	this.totalPrice = totalPrice;
}



@Override
public String toString() {
	return "CartItems [id=" + id + ", cart=" + cart + ", quantity=" + quantity + ", totalPrice=" + totalPrice
			+ ", product=" + product + "]";
}

}
