package com.niit.shoppingbackend.dao;

import java.util.List;

import com.niit.shoppingbackend.dto.Cart;
import com.niit.shoppingbackend.dto.CartItems;

public interface CartItemDAO {
	public boolean save(CartItems cartitem);
	public boolean update(CartItems cartitems);
	public boolean delete(CartItems cartitems);
	public CartItems get(int id);
	public List<CartItems> list(Cart cart);
	public void deletecartitemById(int id);
	
}
