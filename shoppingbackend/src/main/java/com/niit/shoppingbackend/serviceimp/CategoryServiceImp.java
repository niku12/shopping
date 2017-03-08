package com.niit.shoppingbackend.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackend.dao.CategoryDa;
import com.niit.shoppingbackend.dto.Category;
import com.niit.shoppingend.service.CategoryService;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
	private CategoryDa studentDao;
	
	@Transactional
 	public void add(Category category) {
		// TODO Auto-generated method stub
	 studentDao.add(category);
	}

@Transactional
	public void edit(Category category) {
		// TODO Auto-generated method stub
		studentDao.edit(category);
	}

@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentDao.delete(id);
	}

@Transactional
	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		return studentDao.getCategory(id);
	}

@Transactional
	public List getAllCategory() {
		// TODO Auto-generated method stub
		return  studentDao.getAllCategory();
	}

}
