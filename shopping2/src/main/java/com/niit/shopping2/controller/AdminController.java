/*package com.niit.shopping2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingbackend.dao.CategoryDAO;
import com.niit.shoppingbackend.dto.Category;

@Controller


public class AdminController {
	@Autowired
	private CategoryDAO category;
	
	@RequestMapping(value="/Admin")
	public ModelAndView admin(){
		ModelAndView mv=new ModelAndView("Admin");
		return mv;
	}
	
	
	
	@RequestMapping("/Add")
	public ModelAndView add(){
		ModelAndView mv=new ModelAndView("Add");
		return mv;
	}
	@RequestMapping(value="/success")

			    public String saveRegistration(@Valid CategoryDAO student, BindingResult result, ModelMap model){
	 
	        if(result.hasErrors()) {
	                return "error";
	        }
	 
	        
	        return "success";
	    }

	
	
	
	}*/
	
	
	
	

