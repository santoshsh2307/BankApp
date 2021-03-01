package com.quest.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank_tranjection")
public class BankTranjection {
	private Long id;
	private Long fromAccId;
	private Long tranjTypeId;
	private Long toAccId;
	private Float ammount;
	private String createdDate;
	
	
	public BankTranjection() {
		super();
	}
	
	public BankTranjection(Long id, Long fromAccId, Long tranjTypeId, Long toAccId, Float ammount, String createdDate) {
		super();
		this.id = id;
		this.fromAccId = fromAccId;
		this.tranjTypeId = tranjTypeId;
		this.toAccId = toAccId;
		this.ammount = ammount;
		this.createdDate = createdDate;
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

	@Column(name = "from_acc_id")
	public Long getFromAccId() {
		return fromAccId;
	}


	public void setFromAccId(Long fromAccId) {
		this.fromAccId = fromAccId;
	}

	@Column(name = "tranj_type_id")
	public Long getTranjTypeId() {
		return tranjTypeId;
	}


	public void setTranjTypeId(Long tranjTypeId) {
		this.tranjTypeId = tranjTypeId;
	}

	@Column(name = "to_acc_id")
	public Long getToAccId() {
		return toAccId;
	}


	public void setToAccId(Long toAccId) {
		this.toAccId = toAccId;
	}

	@Column(name = "ammount")
	public Float getAmmount() {
		return ammount;
	}


	public void setAmmount(Float ammount) {
		this.ammount = ammount;
	}

	@Column(name = "created_date")
	public String getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	
	
	
	

}
