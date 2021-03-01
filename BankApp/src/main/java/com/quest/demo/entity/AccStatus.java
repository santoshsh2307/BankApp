package com.quest.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "acc_status")
public class AccStatus {
	
	private Long id;
	private String statusName;
	
	public AccStatus() {
		super();
	
	
	}
	
	public AccStatus(Long id, String statusName) {
		super();
		this.id = id;
		this.statusName = statusName;
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
	@Column(name = "status_name")
	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	
	
	

}
