package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.model.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

	
}
