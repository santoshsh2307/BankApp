package com.RDP.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school_staf")
public class SchoolStaf {
	
	private Long id;
	private String userIdName;
	private String pass;
	private Long roleId;
	
	
	public SchoolStaf() {
		super();
	}


	public SchoolStaf(Long id, String userIdName, String pass, Long roleId) {
		super();
		this.id = id;
		this.userIdName = userIdName;
		this.pass = pass;
		this.roleId = roleId;
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

	 @Column(name = "username")
	public String getUserIdName() {
		return userIdName;
	}


	public void setUserIdName(String userIdName) {
		this.userIdName = userIdName;
	}

	@Column(name = "pass")
	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}

	@Column(name = "role_id")
	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	
	
	

}
