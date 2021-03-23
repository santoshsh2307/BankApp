package com.RDP.school.DTO;

public class DriverDTO {

	private Long vicaldetailsId;
	private Long detailId;
	private String autoNumber;
	private Long adhar;
	private String dlNo;
	private String dlPhoto;
	private String name;
	private String password;
	private Long roleId;
	private String roleName;
	private String phone;
	
	public DriverDTO() {
		super();
	}

	public DriverDTO(Long vicaldetailsId, Long detailId, String autoNumber, Long adhar, String dlNo, String dlPhoto,
			String name, String password, Long roleId, String roleName, String phone) {
		super();
		this.vicaldetailsId = vicaldetailsId;
		this.detailId = detailId;
		this.autoNumber = autoNumber;
		this.adhar = adhar;
		this.dlNo = dlNo;
		this.dlPhoto = dlPhoto;
		this.name = name;
		this.password = password;
		this.roleId = roleId;
		this.roleName = roleName;
		this.phone = phone;
	}

	public Long getVicaldetailsId() {
		return vicaldetailsId;
	}

	public void setVicaldetailsId(Long vicaldetailsId) {
		this.vicaldetailsId = vicaldetailsId;
	}

	public Long getDetailId() {
		return detailId;
	}

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	public String getAutoNumber() {
		return autoNumber;
	}

	public void setAutoNumber(String autoNumber) {
		this.autoNumber = autoNumber;
	}

	public Long getAdhar() {
		return adhar;
	}

	public void setAdhar(Long adhar) {
		this.adhar = adhar;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public String getDlPhoto() {
		return dlPhoto;
	}

	public void setDlPhoto(String dlPhoto) {
		this.dlPhoto = dlPhoto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
}
