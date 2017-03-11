package com.niit.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackend.dao.AddressDao;
import com.niit.shoppingbackend.dto.Address;

public class AddressTest {
	private static AnnotationConfigApplicationContext context;
    private static AddressDao addressdao;
	private Address address;
	
	@BeforeClass
	public static void init(){
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingbackend");
	context.refresh();
	addressdao=(AddressDao)context.getBean("addressdao");
	}
	/*@Test
	public void testAddress(){
	address=new Address();
	address.setCity("noida");
	address.setPin("12345");
	address.setShipping("true");
	address.setBilling("true");
	assertEquals("successfully added a category",true,addressdao.add(address));
	
	}*/
	/*@Test
	public void testAddress()
	{
		address =addressdao.get(2);
		
		assertEquals("successfully added a category","noida",address.getCity());	
		
	}*/
	
	@Test
	public void testlistAddress()
	{
		address =addressdao.get(2);
		
		assertEquals("successfully added a category","noida",address.getCity());	
		
	}
}
