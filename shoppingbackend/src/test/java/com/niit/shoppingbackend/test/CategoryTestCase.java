 package com.niit.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackend.dao.CategoryDAO;
import com.niit.shoppingbackend.dao.ProductDao;
import com.niit.shoppingbackend.dto.Category;
import com.niit.shoppingbackend.dto.Product;
public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static CategoryDAO categoryDAO;
	private Category category;
	private static ProductDao productdao1;
	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
      productdao1	=(ProductDao)context.getBean("productdao1");
	
	
	}

	/*@Test
	public void testAddCategory() {
		category = new Category();
		category.setName("Electronic");
		category.setDesc("this is description for laptop");
		category.setImageURL("lap_1.png");
		assertEquals("Successfull added a category inside the table", true, categoryDAO.add(category));
		

	}*/
	/*@Test
	public void testGetCategory(){
		category=categoryDAO.get(1);
		assertEquals("Successfull fetched a single category from the table", "Laptop", category.getName());	
	}*/
	/*@Test
	public void testupdateCategory(){
		category=categoryDAO.get(1);
		category.setName("Mobile");
		assertEquals("Successfull fetched a single category from the table", true, categoryDAO.update(category));	
	}*/
	
	/*@Test
	public void testdeleteCategory(){
		category=categoryDAO.get(1);
		
		assertEquals("Successfull fetched a single category from the table", true, categoryDAO.delete(category));	
	}*/
	/*
	@Test
	public void testListCategory(){
		
		assertEquals("Successfull fetched a single category from the table",1,categoryDAO.list().size());	
	}
 */
	/*@Test
	public void testCRUDCategory(){
		//add
		category=new Category();
		
		category.setName("Moblile");
		category.setDesc("this is description for laptop");
		category.setImageURL("lap_1.png");
		assertEquals("Successfull added a category inside the table", true, categoryDAO.add(category));
		assertEquals("Successfull fetched a single category from the table",1,categoryDAO.list().size());
		
	} */
	
	@Test
	public void testcategorproduct(){
		category=new Category();
		category.setName("Electronics");
		category.setDesc("nice electronics");
		product.setName("Laptop");
		product.setPrice(60000);
		
		
	}
	
	
	
	
	
}
 