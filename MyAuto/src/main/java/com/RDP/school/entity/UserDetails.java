package com.RDP.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userDetails")

public class UserDetails {

private Long id;
private String name;
private String password;
private Long roleId;
private String phone;


public UserDetails() {
	super();
}


public UserDetails(Long id, String name, String password, Long roleId, String phone) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.roleId = roleId;
	this.phone = phone;
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

@Column(name = "name")
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

@Column(name = "password")
public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}

@Column(name = "role_id")
public Long getRoleId() {
	return roleId;
}


public void setRoleId(Long roleId) {
	this.roleId = roleId;
}

@Column(name = "phone_no")
public String getPhone() {
	return phone;
}


public void setPhone(String phone) {
	this.phone = phone;
}	
	
	
	

}
