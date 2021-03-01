package com.quest.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tranjection_type")
public class TranjectionType {
	private Long id;
	private String tranjectionName;
	
	
	public TranjectionType() {
		super();
	}


	public TranjectionType(Long id, String tranjectionName) {
		super();
		this.id = id;
		this.tranjectionName = tranjectionName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "tranjection_tname")
	public String getTranjectionName() {
		return tranjectionName;
	}


	public void setTranjectionName(String tranjectionName) {
		this.tranjectionName = tranjectionName;
	}
	
	
	
	
	
	
	

}
