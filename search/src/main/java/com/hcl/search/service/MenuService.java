package com.hcl.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.search.model.MenuItem;
import com.hcl.search.repo.MenuRepository;

@Service
public class MenuService {

	@Autowired
	MenuRepository menuRepo;
	
	public void saveOrUpdate(MenuItem books)   {  
		menuRepo.save(books);  
	}

	public void deleteBook(String id) {
		// TODO Auto-generated method stub
		menuRepo.deleteById(id);
	}  
	
	
}
