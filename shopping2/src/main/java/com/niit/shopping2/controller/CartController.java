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
import com.niit.shoppingbackend.dao.ProductDao;
import com.niit.shoppingbackend.dao.UserDAO;
import com.niit.shoppingbackend.dto.Cart;
import com.niit.shoppingbackend.dto.CartItems;
import com.niit.shoppingbackend.dto.Product;
import com.niit.shoppingbackend.dto.User;

@Controller
@RequestMapping
public class CartController {
	
//--------------------------------------------------------------------------------------------------------------
	@Autowired
	UserDAO usersDAO;
	@Autowired
	CartItemDAO cartItemDAO;
	@Autowired
	ProductDao productDAO;
	@Autowired
	CartDAO cartDAO;
	
	
	
	
/*@RequestMapping("customer/elec4/{id}")
	public String customerplay(Principal principal,@PathVariable("id") int id,ModelMap model){
		if(principal !=null)
		{
			User user=usersDAO.getuserbyname(principal.getName());
			Cart cart=user.getCart();
			model.addAttribute("cartdetails",true);
			model.addAttribute("cartItems",cartItemDAO.list());
			model.addAttribute("cartcount",cart.getCartItemCount());
		}
		return "cart";
	}*/
	
	@RequestMapping("customer/elec4/{id}")
	public ModelAndView addToCart(Principal principal,@PathVariable("id") Integer id,ModelMap model)
	{
		ModelAndView mv=new ModelAndView("cart");
		
	//	System.out.println(usersDAO.getuserbyname(principal.getName()));
	      // if(principal !=null)
	       //{
	    	   User user=usersDAO.getuserbyname(principal.getName());
	    	  //Cart cart=user.getCart();
	    	   Product product=productDAO.get(id);
	    	/*   	Cart cart =new Cart();  
	    	//  productDAO.save(product);
	    	   CartItems cartItem=new CartItems();
	    	   cartItem.setCart(cart);
	    	   cartItem.setProduct(product);
	    	   cartItem.setQuantity(1);
	    	   cartItem.setTotalPrice(product.getPrice() * cartItem.getQuantity());
	    	   cart.setGrandtotal(cart.getGrandtotal() + cartItem.getTotalPrice());
	    	   cart.setCartItemCount(cart.getCartItemCount() + 1);
	    	   cartItemDAO.save(cartItem);
	    	//   cartDAO.update(cart);
	    	   
	    	   
	    //	 mv.addObject("object",cartItemDAO); */
	    	   mv.addObject("product",product);
	    	 
	       //}  	   
	    	   
	       return mv;  
			 
		
			
			
  
	    	   
	    	   
	    	 
	       }
		
	//	User user=usersDAO.getuserbyname(principal.getName());
		
		/*Cart cart=user.getCart();
		if(cart==null)
		{
			cart=new Cart();
			user.setCart(cart);
			cart.setUser(user);
			usersDAO.update(user);
		}*/
	/*	cart=user.getCart();
		Product product=productDAO.get(id);
		CartItems cartItem=(CartItems)cartItemDAO.get(id);
		if(cartItem==null)
		      cartItem=new CartItems();
		     cartItem.setCart(cart);
		     cartItem.setProduct(product);
		     cartItem.setQuantity(cartItem.getQuantity()+1);
		     System.out.println("cart item quantity"+ cartItem.getQuantity());
		     cartItem.setTotalPrice(product.getPrice()*cartItem.getQuantity());
		     System.out.println("pid"+product.getId());
		     cart.setGrandtotal(cart.getGrandtotal()+cartItem.getTotalPrice());
		     cart.setCartItemCount(cart.getCartItemCount()+1);
		     mv.addObject("customer", true);
		     mv.addObject("addtocart",true);
		     mv.addObject("customerClick",true);
		     mv.addObject("cart",cartItemDAO.list());
		     cartItemDAO.save(cartItem);
		     return mv;
		     
		     
		 }*/
	
	
	
	
	
	
	
	
	
	
	/*@RequestMapping("customer/elec4/{id}")
	public ModelAndView addToCart(Principal principal,@PathVariable Integer id,ModelMap model)
	{
		ModelAndView mv=new ModelAndView("cart");
	//	Principal p=request.get
		System.out.println(usersDAO.getuserbyname(principal.getName()));
		User user=usersDAO.getuserbyname(principal.getName());
		
		/*Cart cart=user.getCart();
		if(cart==null)
		{
			cart=new Cart();
			user.setCart(cart);
			cart.setUser(user);
			usersDAO.update(user);
		}*/
	/*	cart=user.getCart();
		Product product=productDAO.get(id);
		CartItems cartItem=(CartItems)cartItemDAO.get(id);
		if(cartItem==null)
		      cartItem=new CartItems();
		     cartItem.setCart(cart);
		     cartItem.setProduct(product);
		     cartItem.setQuantity(cartItem.getQuantity()+1);
		     System.out.println("cart item quantity"+ cartItem.getQuantity());
		     cartItem.setTotalPrice(product.getPrice()*cartItem.getQuantity());
		     System.out.println("pid"+product.getId());
		     cart.setGrandtotal(cart.getGrandtotal()+cartItem.getTotalPrice());
		     cart.setCartItemCount(cart.getCartItemCount()+1);
		     mv.addObject("customer", true);
		     mv.addObject("addtocart",true);
		     mv.addObject("customerClick",true);
		     mv.addObject("cart",cartItemDAO.list());
		     cartItemDAO.save(cartItem);
		     return mv;
		     
		     
		 }*/
	
	
	
	
	
	
}	
	
	

