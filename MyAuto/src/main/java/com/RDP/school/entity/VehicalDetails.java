package com.RDP.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehical_details")
public class VehicalDetails {
	
	private Long id;
	private Long detailId;
	private String autoNumber;
	private Long adhar;
	private String dlNo;
	private String dlPhoto;
	
	public VehicalDetails() {
		super();
	}

	public VehicalDetails(Long id, Long detailId, String autoNumber, Long adhar, String dlNo, String dlPhoto) {
		super();
		this.id = id;
		this.detailId = detailId;
		this.autoNumber = autoNumber;
		this.adhar = adhar;
		this.dlNo = dlNo;
		this.dlPhoto = dlPhoto;
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
	@Column(name = "detail_id")
	public Long getDetailId() {
		return detailId;
	}

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}
	@Column(name = "auto_no")
	public String getAutoNumber() {
		return autoNumber;
	}

	public void setAutoNumber(String autoNumber) {
		this.autoNumber = autoNumber;
	}
	@Column(name = "adhar")
	public Long getAdhar() {
		return adhar;
	}

	public void setAdhar(Long adhar) {
		this.adhar = adhar;
	}
	@Column(name = "dl_no")
	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	@Column(name = "dl_photo")
	public String getDlPhoto() {
		return dlPhoto;
	}

	public void setDlPhoto(String dlPhoto) {
		this.dlPhoto = dlPhoto;
	}
	

}
