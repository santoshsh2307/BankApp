package com.RDP.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "time")
public class Time {
	private Long id;
	private Long dayId;
	private Long stafId;
	private Long standerd;
	private String time;
	private Long status;
	private String sub;
	
	
	public Time() {
		super();
	}


	public Time(Long id, Long dayId, Long stafId, Long standerd, String time, Long status, String sub) {
		super();
		this.id = id;
		this.dayId = dayId;
		this.stafId = stafId;
		this.standerd = standerd;
		this.time = time;
		this.status = status;
		this.sub = sub;
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
	
	@Column(name = "day_id")
	public Long getDayId() {
		return dayId;
	}


	public void setDayId(Long dayId) {
		this.dayId = dayId;
	}

	@Column(name = "staf_id")
	public Long getStafId() {
		return stafId;
	}


	public void setStafId(Long stafId) {
		this.stafId = stafId;
	}

	@Column(name = "standard")
	public Long getStanderd() {
		return standerd;
	}


	public void setStanderd(Long standerd) {
		this.standerd = standerd;
	}

	@Column(name = "time")
	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}

	@Column(name = "status")
	public Long getStatus() {
		return status;
	}


	public void setStatus(Long status) {
		this.status = status;
	}

	@Column(name = "sub")
	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}
	
	
	

}
