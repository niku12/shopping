package com.niit.shopping2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingbackend.dao.CategoryDAO;
import com.niit.shoppingbackend.dto.Category;

@Controller
public class ProductController {
	
	
	
		@Autowired
		private CategoryDAO productdao1;
		@RequestMapping("/all/data")
		public @ResponseBody List<Category> getAllProduct1()
		{
			
			return productdao1.list();
		}
		@RequestMapping("/electro")
		public  ModelAndView getAllProduct()
		{		
			return new ModelAndView("electro") ;
		}
		@RequestMapping("/elec1/{id}")
		public ModelAndView productview(@PathVariable("id") int id)
		{
			ModelAndView mv=new ModelAndView("productView");
			mv.addObject("product",productdao1.get(id));
		
			return mv;
		}


}
