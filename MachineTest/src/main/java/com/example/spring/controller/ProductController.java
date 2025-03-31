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

import com.example.spring.model.Product;
import com.example.spring.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	ProductService productService;


	
//	@PostMapping("/product/add")
	 @PostMapping
	public void createProduct(@RequestBody Product product)
	{
		productService.createProduct(product);
	}
	
//	@GetMapping("/products")
//	@GetMapping
//	public List<Product> getAllProduct(@RequestParam(defaultValue = "0") int page)
//	{
//		return productService.getAllProduct(page);
//	}
	
//	@GetMapping("/productss")
	@GetMapping
	public List<Object[]> getAllProductWithCategoryName(@RequestParam(defaultValue = "0") int page)
	{
		return productService.getAllProductWithCategoryName(page);
	}
	
//	@GetMapping("/products/{id}")
	 @GetMapping("/{id}")
	public Product getProduct(@PathVariable int id)
	{
		return productService.getProduct(id);
	}
	
	
//	@PutMapping("/product/update/{id}")
	 @PutMapping("/{id}")
	public Product updateCategory(@PathVariable int id,@RequestBody Product product)
	{
	return productService.updateProduct(id,product);
	}
	
//	@DeleteMapping("/product/delete/{id}")
	 @DeleteMapping("/{id}")
	public void removeProduct(@PathVariable int id)
	{
		productService.removeProduct(id);
	}
	
}
