package com.hcl.search.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.search.model.MenuItem;
@Repository
@Transactional

public interface MenuRepository extends CrudRepository<MenuItem, String>{

	List<MenuItem> findByCategory(String catagory);
    Optional<MenuItem> findById(String itemId);
	//void delete(Optional<MenuItem> menuItem);
}
