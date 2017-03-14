package com.niit.shoppingbackend.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart implements Serializable {
	
	private static final long serialVersionUID=6778L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY  )
	private int id;
	private float grandtotal;
	@OneToOne(cascade=CascadeType.PERSIST)
	private User user;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="cart")
	private List<CartItems> cardItems;
	private int cartItemCount;

	public int getCartItemCount() {
		return cartItemCount;
	}
	public void setCartItemCount(int cartItemCount) {
		this.cartItemCount = cartItemCount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(float grandtotal) {
		this.grandtotal = grandtotal;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<CartItems> getCardItems() {
		return cardItems;
	}
	public void setCardItems(List<CartItems> cardItems) {
		this.cardItems = cardItems;
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", grandtotal=" + grandtotal + ", user=" + user + ", cardItems=" + cardItems
				+ ", cartItemCount=" + cartItemCount + "]";
	}
	
	

}
 