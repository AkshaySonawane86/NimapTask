package com.example.spring.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.spring.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

//	@Query("select p.pid,p.pname,c.cname from product p inner join category c on p.category_id=c.id")
	@Query("SELECT p.pid, p.pname, c.cname FROM Product p INNER JOIN p.category c")
	List<Object[]> getProductWithCategoryName();
}
