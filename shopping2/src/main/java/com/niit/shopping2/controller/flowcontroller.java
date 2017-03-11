package com.niit.shopping2.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingbackend.dto.Address;
import com.niit.shoppingbackend.dto.User;

/*@Controller
public class flowcontroller {

	@RequestMapping("/Register")
	public ModelAndView register(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("userClicklogin",true);
		mv.addObject("Register");
		mv.addObject("user",new User());
		return mv;
	}
	
	/*@RequestMapping("/Address1")
	public ModelAndView billing()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("userClickbilling",true);
		mv.addObject("Address1");
		mv.addObject("address",new Address());
	    return mv;	
	}
	@RequestMapping("/Edit")
	public ModelAndView billing1()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("userClickbilling",true);
		mv.addObject("Address1");
		mv.addObject("address",new Address());
	    return mv;	
	}
	
	@RequestMapping(method = RequestMethod.POST)
    public String saveRegistration(@Valid User user, BindingResult result, ModelMap model){
 
        if(result.hasErrors()) {
                return "Register";
        }
 
        model.addAttribute("success", "Dear "+ user.getName()+" , your Registration completed successfully");
        return "Address1";
    }
 
   
	
}*/
