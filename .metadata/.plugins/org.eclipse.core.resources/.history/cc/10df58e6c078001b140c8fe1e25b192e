package com.quest.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class AcctDetail {
	private Long id;
	private String accName;
	private String branch;
	private String accNo;
	private String ifscCode;
	private String phone;
	private Long accTypeId;
	private String ceatedDate;
	private Long statusId;
	private Float ammount;
	
	
	public AcctDetail() {
		super();
	}


	public AcctDetail(Long id, String accName, String branch, String accNo, String ifscCode, String phone,
			Long accTypeId, String ceatedDate, Long statusId, Float ammount) {
		super();
		this.id = id;
		this.accName = accName;
		this.branch = branch;
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.phone = phone;
		this.accTypeId = accTypeId;
		this.ceatedDate = ceatedDate;
		this.statusId = statusId;
		this.ammount = ammount;
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

	@Column(name = "acc_name")
	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Column(name = "branch")
	public String getBranch() {
		return branch;
	}

	
	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Column(name = "acc_no")
	public String getAccNo() {
		return accNo;
	}


	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	@Column(name = "ifsc_code")
	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Column(name = "phone_no")
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "acc_type_id")
	public Long getAccTypeId() {
		return accTypeId;
	}


	public void setAccTypeId(Long accTypeId) {
		this.accTypeId = accTypeId;
	}

	@Column(name = "created_date")
	public String getCeatedDate() {
		return ceatedDate;
	}


	public void setCeatedDate(String ceatedDate) {
		this.ceatedDate = ceatedDate;
	}

	@Column(name = "status_id")
	public Long getStatusId() {
		return statusId;
	}


	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	@Column(name = "ammount")
	public Float getAmmount() {
		return ammount;
	}


	public void setAmmount(Float ammount) {
		this.ammount = ammount;
	}
	
	
	
	

}
