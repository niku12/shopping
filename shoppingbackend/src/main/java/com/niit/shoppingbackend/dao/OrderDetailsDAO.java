package com.niit.shoppingbackend.dao;

import java.util.List;

import com.niit.shoppingbackend.dto.OrderDetails;



public interface OrderDetailsDAO {
	public boolean save(OrderDetails orderdetails);
	public boolean update(OrderDetails orderdetails);
	public boolean delete(OrderDetails orderdetails);
	public OrderDetails get(int id);
	public List<OrderDetails> list(OrderDetails orderdetails);
	public void deletecartitemById(int id);
	
}
