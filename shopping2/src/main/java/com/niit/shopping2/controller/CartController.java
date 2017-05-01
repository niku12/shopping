package com.niit.shopping2.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingbackend.dao.CartDAO;
import com.niit.shoppingbackend.dao.CartItemDAO;
import com.niit.shoppingbackend.dao.CategoryDa;
import com.niit.shoppingbackend.dao.ProductDao;
import com.niit.shoppingbackend.dao.UserDAO;
import com.niit.shoppingbackend.dto.Cart;
import com.niit.shoppingbackend.dto.CartItems;
import com.niit.shoppingbackend.dto.Category;
import com.niit.shoppingbackend.dto.Product;
import com.niit.shoppingbackend.dto.User;

@Controller
@RequestMapping
public class CartController {
	

	@Autowired
	UserDAO usersDAO;
	@Autowired
	CartItemDAO cartItemDAO;
	@Autowired
	CategoryDa productDAO;
	@Autowired
	CartDAO cartDAO;
	
	
	
	
	
	@RequestMapping("customer/elec4/{id}")
	public ModelAndView addToCart(Principal principal,@PathVariable("id") Integer id,ModelMap model)
	{
		ModelAndView mv=new ModelAndView("electro");
			    	   User user=usersDAO.getuserbyname(principal.getName());
	    	  Cart cart=user.getCart();
	    	     	  
	    		    if(cart==null){
	    	cart=new Cart();
	    	user.setCart(cart);
	    	cart.setUser(user);
	       usersDAO.update(user);
	    }
	    	  
	    	   Category product=productDAO.getCategory(id);
	    	   CartItems cartItem= (CartItems) cartItemDAO.getCartItemWithCartAndProduct(id,cart.getId());
	    	     if(cartItem==null){
	    	    	 cartItem=new CartItems();
	    	    	 cartItem.setCart(cart); 
	    	   	  cartItem.setProduct(product);
	    	   	  cartItem.setQuantity(1);
	    	   	  
	    	   	  cartItem.setTotalPrice(product.getPrice() );
	    	   	  
	    	   	  cart.setGrandtotal(cart.getGrandtotal() + cartItem.getTotalPrice());
	    	   	 
	    	   	  cart.setCartItemCount(cart.getCartItemCount()+1);
	    	   	cartItemDAO.save(cartItem);
	    	   	System.out.println("hello");
	    	     }else{
	  
	  cartItem.setQuantity(cartItem.getQuantity()+1);
	  cartItem.setTotalPrice(cartItem.getTotalPrice()+product.getPrice());
	  cartItem.getCart().setCartItemCount(cart.getCartItemCount()+1);
	  cartItem.getCart().setGrandtotal(cart.getGrandtotal()+product.getPrice());
	  cartItemDAO.update(cartItem);
	    	     }
	  mv.addObject("customer",true);
	  mv.addObject("addtocart",true);
	  mv.addObject("customerClick",true);
	  mv.addObject("cart",cartItemDAO.list(cart));
	  
	  return mv;
	}			
			
	@RequestMapping("/customer/viewCart")
	public ModelAndView viewCustomerCart( Principal principal)
	{
		User user =  usersDAO.getuserbyname(principal.getName());
		Cart cart =  user.getCart();
		ModelAndView model = new ModelAndView("page");
		model.addObject("userClickViewCart", true);
		model.addObject("cartId", cart.getId());
	    model.addObject("cartItems", cartItemDAO.list(cart));
		return model;
	
	}
	    	   
	@RequestMapping("/customer/{id}/removeCartItem")
	public ModelAndView customerRemoveCartItem(@PathVariable Integer id , Principal principal)
	{
		User user =  usersDAO.getuserbyname(principal.getName());
		Cart cart =  user.getCart();
		CartItems cartItem =  cartItemDAO.get(id);
		
		cartItemDAO.deletecartitemById(id);
		
		
		ModelAndView model = new ModelAndView("page");
		
		model.addObject("cartId", cart.getId());
	    model.addObject("cartItems", cartItemDAO.list(cart));
        model.addObject("userClickViewCart", true);
		
		
	    return model;
	}	   
	  
	@RequestMapping("/customer/checkout")
	public ModelAndView order( Principal principal)
	{User user =  usersDAO.getuserbyname(principal.getName());
	Cart cart =  user.getCart();
	ModelAndView m1=new ModelAndView("page");
	ModelAndView model = new ModelAndView("order");	
		if(cart.getGrandtotal()==0)
	{
			
		//m1.addObject("userClickOrder",true);
	//	m1.addObject("cartId", cart.getId());
	
		return m1;
	}else
			
		model.addObject("userClickOrder", true);
		model.addObject("cartId", cart.getId());
	    model.addObject("cartItems", cartItemDAO.list(cart));
		return model;
		}
	
	
	
	
	
	}
	
	
	       
		
	
	

