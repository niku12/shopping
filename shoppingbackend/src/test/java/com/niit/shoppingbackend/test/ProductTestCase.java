package com.niit.shoppingbackend.test;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackend.dao.ProductDao;
import com.niit.shoppingbackend.dto.Product;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private  static ProductDao productdao;
	private Product product;
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingbackend");
		context.refresh();
		productdao=(ProductDao) context.getBean("productdao");
	}
	/*@Test
	public void testAddUser() {
		product = new Product();
		product.setName("laptop");
		product.setPrice(34);
		
		 assertEquals("successfully",true,productdao.save(product));
		//assertEquals("Successfull added a category inside the table", true, userDAO.add(user));
       
	}*/
	/*@Test
	public void testget(){ 
		product=productdao.get(3);
		assertEquals("successfully","laptop",product.getName());
		 
	}*/
	
	/*@Test 
	public void testupdat()
	{
		 product=productdao.get(1);
		 product.setName("tv");
		 assertEquals("successfully",true,productdao.update(product));	 
	} */
	/*@Test
	public void testupdat()
	{
		 product=productdao.get(3);
		 product.setName("tv");
		 assertEquals("successfully","laptop",true,productdao.update(product));	 
	}*/
	
	
	/*@Test
	public void testupdat()
	{
		 product=productdao.get(1);
		 
		 assertEquals("successfully",true,productdao.delete(product));	 
	}*/
	
	@Test 
	public void testlistdat()
	{
		 assertEquals("successfully",1,productdao.list().size());	 
	}
	
}
