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
private Long genderId;
private String profilePhoto;
private String email;
private String address;

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

@Column(name = "gender_id")
public Long getGenderId() {
	return genderId;
}


public void setGenderId(Long genderId) {
	this.genderId = genderId;
}

@Column(name = "profile_photo")
public String getProfilePhoto() {
	return profilePhoto;
}


public void setProfilePhoto(String profilePhoto) {
	this.profilePhoto = profilePhoto;
}

@Column(name = "email")
public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}

@Column(name = "address")
public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}	
	
	
	

}
