package com.niit.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackend.dao.CartItemDAO;
import com.niit.shoppingbackend.dao.CategoryDa;
import com.niit.shoppingbackend.dao.ProductDao;
import com.niit.shoppingbackend.dao.UserDAO;
import com.niit.shoppingbackend.dto.Cart;
import com.niit.shoppingbackend.dto.CartItems;
import com.niit.shoppingbackend.dto.Category;
import com.niit.shoppingbackend.dto.Product;
import com.niit.shoppingbackend.dto.User;

public class cardtestcase {
private static AnnotationConfigApplicationContext context;
private static CartItemDAO cartItemDAO;
private static UserDAO userDAO;
//private static ProductDao productDAO1;
private static CategoryDa productdao;


@BeforeClass
public static void init(){
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingbackend");
	context.refresh();
	cartItemDAO=(CartItemDAO)context.getBean("cartitemdao");
	userDAO=(UserDAO)context.getBean("userDAO");
	//productDAO1=(ProductDao)context.getBean("productdao1");
	productdao=(CategoryDa)context.getBean("categoryDa");
}

/*@Test
public void testlistitem(){
	User user=userDAO.get(1);
	Cart cart=user.getCart();
	assertEquals("list CartItem fetched",1,cartItemDAO.list().size());
	
}*/

//Adding a new cartItem
	@Test
	public void testAddCartItem() {
		
		// get the user
		User user = userDAO.get(2);
		// get the cart
		Cart cart = user.getCart();

		// get the product
		//Product product = productDAO1.get(1);
		Category product1= productdao.getCategory(140);
		CartItems cartItem = new CartItems();
		cartItem.setCart(cart);
		cartItem.setProduct(product1);
		cartItem.setQuantity(2);
		cartItem.setTotalPrice(product1.getPrice() * cartItem.getQuantity());
	
		cart.setGrandtotal(cart.getGrandtotal() + cartItem.getTotalPrice());
		cart.setCartItemCount(cart.getCartItemCount() + 1);
		assertEquals("Successfully added the cart item!",true, cartItemDAO.save(cartItem));
		
		
	}
	
// updating the existing cart item
/*@Test
public void testUpdateCartItem() {
			
	CartItems cartItem = cartItemDAO.get(2);
	
	Cart cart = cartItem.getCart();
	
	Product product = cartItem.getProduct();
	
	int oldQuantity = cartItem.getQuantity();

	cartItem.setQuantity(cartItem.getQuantity() + 1);
	
	cartItem.setTotalPrice(product.getPrice() * cartItem.getQuantity());
	
	cart.setGrandtotal(cart.getGrandtotal() + (cartItem.getQuantity() - oldQuantity) * product.getPrice());
	
	assertEquals("Successfully updated the cart item!",true, cartItemDAO.update(cartItem));*/

	//assertEquals("Successfully updated the cart item!",true, cartItemDAO.updateCart(cart));

	
}








