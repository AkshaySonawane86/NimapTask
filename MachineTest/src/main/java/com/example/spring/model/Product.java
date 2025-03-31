package com.example.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pid")
	private int pid;
	
	@Column(name="pname")
	private String pname;
	
//	private String cname;
//	
//	public String getCname() {
//		return cname;
//	}


	public Product()
	{
		
	}
	
	public Product(int pid, String pname, Category category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.category = category;
	}

	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

}
