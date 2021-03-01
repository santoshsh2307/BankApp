package com.RDP.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "days")
public class days {
	private Long id;
	private String day;
	
	
	public days() {
		super();
	}


	public days(Long id, String day) {
		super();
		this.id = id;
		this.day = day;
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

	@Column(name = "day")
	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}
	
	

}
