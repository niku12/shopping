package com.niit.shoppingbackend.dao;

import java.util.List;


import com.niit.shoppingbackend.dto.Order;

public interface OrderDAO {
	public boolean save(Order order);
	public boolean update(Order order);
	public boolean delete(Order order);
	public Order get(int id);
	public List<Order> list();
}
