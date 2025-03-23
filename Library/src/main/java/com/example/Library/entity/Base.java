package com.example.Library.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Base {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public Base() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
