package com.RDP.school.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "trip_details")
public class TripDetails {
	private Long id;
	private Long custumerId;
	private Long ownerId;
	private String time;
	private Double fromLatitude;
	private Double fromLongitude;
	private Double toLatitude;
	private Double toLongitude;
	private String date;
	private Long status;
	private Float distance;
	private Float ammount;
	
	public TripDetails() {
		super();
	}

	public TripDetails(Long id, Long custumerId, Long ownerId, String time, Double fromLatitude,
			Double fromLongitude, Double toLatitude, Double toLongitude, String date, Long status, Float distance, Float ammount) {
		super();
		this.id = id;
		this.custumerId = custumerId;
		this.ownerId = ownerId;
		this.time = time;
		this.fromLatitude = fromLatitude;
		this.fromLongitude = fromLongitude;
		this.toLatitude = toLatitude;
		this.toLongitude = toLongitude;
		this.date = date;
		this.status= status;
		this.distance= distance;
		this.ammount=ammount;
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
	@Column(name = "custumer_user_id")
	public Long getCustumerId() {
		return custumerId;
	}

	public void setCustumerId(Long custumerId) {
		this.custumerId = custumerId;
	}
	@Column(name = "owner_id")
	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	@Column(name = "time")
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	@Column(name = "from_latitude")
	public Double getFromLatitude() {
		return fromLatitude;
	}

	public void setFromLatitude(Double fromLatitude) {
		this.fromLatitude = fromLatitude;
	}
	@Column(name = "from_longitude")
	public Double getFromLongitude() {
		return fromLongitude;
	}

	public void setFromLongitude(Double fromLongitude) {
		this.fromLongitude = fromLongitude;
	}
	@Column(name = "to_latidude")
	public Double getToLatitude() {
		return toLatitude;
	}

	public void setToLatitude(Double toLatitude) {
		this.toLatitude = toLatitude;
	}
	@Column(name = "tolongitude")
	public Double getToLongitude() {
		return toLongitude;
	}

	public void setToLongitude(Double toLongitude) {
		this.toLongitude = toLongitude;
	}
	@Column(name = "date")
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "status_id")
	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	@Column(name = "distance")
	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}
	@Column(name = "ammount")
	public Float getAmmount() {
		return ammount;
	}

	public void setAmmount(Float ammount) {
		this.ammount = ammount;
	}
	
	
	

}
