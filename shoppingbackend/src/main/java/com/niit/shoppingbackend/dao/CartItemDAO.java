package com.niit.shoppingbackend.dao;

import java.util.List;

import com.niit.shoppingbackend.dto.CartItems;
import com.niit.shoppingbackend.dto.Product;

public interface CartItemDAO {
	public boolean save(CartItems cartitem);
	public boolean update(CartItems cartitems);
	public boolean delete(CartItems cartitems);
	public CartItems get(int id);
	public List<CartItems> list();
	
}
