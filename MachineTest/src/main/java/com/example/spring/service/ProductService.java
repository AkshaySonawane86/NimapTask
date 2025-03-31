package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.Product;
import com.example.spring.repository.ProductRepo;

@Service("productService")
public class ProductService {

	@Autowired
	ProductRepo repo;
	
	
	
	public void createProduct(Product product)
	{
		repo.save(product);
	}
	
	public List<Product> getAllProduct()
	{
		List<Product> product=repo.findAll();
		return product;
	}
	
	public List<Object[]> getAllProductWithCategoryName(int page)
	{
		return repo.getProductWithCategoryName();
	
	}
	
	public Product getProduct(int id)
	{
		Product product=repo.findById(id).get();
		return product;
	}
	
	public Product updateProduct(int id,Product pro)
	{
		 Product product = repo.findById(id).orElseThrow();
	        product.setPname(pro.getPname());
	        product.setCategory(pro.getCategory());
		repo.save(product);
		return product;
	}
	
	public void removeProduct(int id)
	{
		Product product=repo.findById(id).get();
		repo.delete(product);
	}
}
