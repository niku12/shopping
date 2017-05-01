package com.niit.shopping2.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingbackend.dao.CategoryDa;
import com.niit.shoppingbackend.dto.Category;



@Controller
public class CategoryController {
	@Autowired
	private CategoryDa catego;

	//multipart
	@Autowired
	HttpServletRequest request;
      
	//private CategoryService laptop;
	@RequestMapping("/Admin" )
    public ModelAndView listAllProduct(){ 
     
		ModelAndView mv=new ModelAndView("Add1");
    	mv.addObject("title","Admin Page");
    	mv.addObject("userClickAdmin",true);
    	mv.addObject("laptop",new Category());
		return mv;
	}
		@RequestMapping(value="/laptop.do",method=RequestMethod.POST)
	public ModelAndView doAction(@Valid @ModelAttribute Category category,BindingResult result,@RequestParam String action,Map<String,Object>map)
	{
		if(((result.getErrorCount()>0))&&(category.getId()==0))
		{
			ModelAndView mv=new ModelAndView("Add1");
			mv.addObject("title","Admin");
			mv.addObject("userClickAdmin",true);
			mv.addObject("laptop",new Category());
			return mv;
			
			
		}
		else
			
		{
			int choice=0;
			Category productResult=new Category();
			if(action.equals("add"))
				choice=1;
			if(action.equals("update"))
				choice=2;
			if(action.equals("delete"))
				choice=3;
			if(action.equals("search"))
				choice=4;
			switch(choice)
			{
			case 1:
				catego.add(category);
				productResult=new Category();
				//image upload
				File file=new File(request.getRealPath("asset//image//"));
				/*System.out.println(file.exists());*/
				if(!file.exists()){
					file.mkdirs();
				}
				File storagepath=new File(request.getRealPath("asset//image//")+File.separator+category.getName()+".jpg");
				System.out.println(storagepath);
				try{
				byte[] imagebytes=category.getFiles().getBytes();
				System.out.println(imagebytes);
				BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(storagepath));
				bufferedOutputStream.write(imagebytes);
				bufferedOutputStream.close();
				}catch(Exception e){e.printStackTrace();}
//end image upload
				break;
				
			case 2:
				catego.edit(category);
				productResult=new Category();
				break;
			case 3:
				catego.delete(category.getId());;
				productResult=(productResult !=null)? productResult:new Category();
			}
		ModelAndView mv=new ModelAndView("Add1");	
		map.put("laptop",productResult);
		mv.addObject("userClickAdminPage",true);
		
		map.put("studentList",catego.getAllCategory());
		return mv;
			
		}
		
		
		
	}
}
		
		
		
	