package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Category;
import com.example.spring.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	CategoryService categoryService;


	
//	@PostMapping("/category/add")
	@PostMapping
	public void createCategory(@RequestBody Category category)
	{
		categoryService.createCategory(category);
	}
	
//	@GetMapping("/api/categories")
	@GetMapping
	public List<Category> getAllCategory(@RequestParam(defaultValue = "0") int page)
	{
		return categoryService.getAllCategory(page);
	}
	
//	@GetMapping("/categorys/{id}")
	 @GetMapping("/{id}")
	public Category getCategory(@PathVariable int id)
	{
		return categoryService.getCategory(id);
	}
	
	
//	@PutMapping("/category/update/{id}")
	 @PutMapping("/{id}")
	public Category updateCategory(@PathVariable int id,@RequestBody Category category)
	{
	return categoryService.updateCategory(id,category);
	}
	
//	@DeleteMapping("/category/delete/{id}")
	 @DeleteMapping("/{id}")
	public void removeCategory(@PathVariable int id)
	{
		categoryService.removeCategory(id);
	}
	
}
