package com.hcl.search.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.search.model.MenuItem;
import com.hcl.search.repo.MenuRepository;
import com.hcl.search.service.MenuService;

import io.swagger.annotations.ApiParam;

@RestController
public class SearchController {

    private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	MenuService menuService;
	
	@Autowired
	MenuRepository menuItemRepository;
	
	@PostMapping("/books")  
	private String saveBook(@ApiParam(value = "ID of person to return", required = true, example = "123") @RequestBody MenuItem books) {  
	menuService.saveOrUpdate(books);  
	return books.getId();  
	}  
	
	@GetMapping(value = "/category/{category}")
    public List<MenuItem> searchName(@ApiParam(value = "ID of person to return", required = true, example = "Java") @PathVariable final String category) {
        logger.info("Invoking searchName method url {}"+category);
        return menuItemRepository.findByCategory(category);
    }

    @GetMapping(value = "/{itemId}")
    public Optional<MenuItem> searchId(@ApiParam(value = "ID of person to return", required = true, example = "123") @PathVariable final String itemId) {
        logger.info("Invoking searchId method url {}"+ itemId);
        return menuItemRepository.findById(itemId);
    }

    @GetMapping(value = "/all")
    public List<MenuItem> searchAll() {
        logger.info("Invoking searchAll method url {}");
        List<MenuItem> itemList = new ArrayList<>(); 
        Iterable<MenuItem> items = menuItemRepository.findAll();
        items.forEach(itemList::add);
        return itemList;
    }
    
    @DeleteMapping(value = "/books/{id}")
    public void deleteBook(@PathVariable String id) {


        menuService.deleteBook(id);

    }
}
