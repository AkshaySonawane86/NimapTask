package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.Category;
import com.example.spring.repository.CategoryRepo;

@Service("categoryService")
public class CategoryService {

	@Autowired
	CategoryRepo repo;
	
	
	
	public void createCategory(Category category)
	{
		repo.save(category);
	}
	
	public List<Category> getAllCategory(int page)
	{
		List<Category> category=repo.findAll();
		return category;
	}
	
	public Category getCategory(int id)
	{
		Category category=repo.findById(id).get();
		return category;
	}
	
	public Category updateCategory(int id,Category categories)
	{
		Category category = repo.findById(id).orElseThrow();
		category.setCname(categories.getCname());
		repo.save(category);
		return category;
	}
	
	public void removeCategory(int id)
	{
		Category category=repo.findById(id).get();
		repo.delete(category);
	}

}
