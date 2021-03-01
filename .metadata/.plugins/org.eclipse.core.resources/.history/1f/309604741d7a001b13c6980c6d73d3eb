package com.RDP.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class login {
	private Long id;
	private Long userid;
	private String loginTime;
	private String logOutTime;
	
	public login() {
		super();
	}

	public login(Long id, Long userid, String loginTime, String logOutTime) {
		super();
		this.id = id;
		this.userid = userid;
		this.loginTime = loginTime;
		this.logOutTime = logOutTime;
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
	@Column(name = "user_id")
	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}
	@Column(name = "login_time")
	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	@Column(name = "logout_time")
	public String getLogOutTime() {
		return logOutTime;
	}

	public void setLogOutTime(String logOutTime) {
		this.logOutTime = logOutTime;
	}
	
	
	
	

}
