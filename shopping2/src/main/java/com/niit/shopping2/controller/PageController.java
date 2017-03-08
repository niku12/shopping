package com.niit.shopping2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		
		return mv;
	}
	@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView mv=new ModelAndView("about");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		
		return mv;
	}
	
	/*@RequestMapping(value="/electro")
	public ModelAndView electro(){
		ModelAndView mv=new ModelAndView("electro");
		mv.addObject("title","Electronics");
		mv.addObject("userClickElectro",true);
		
		return mv;
	}*/
	
}
