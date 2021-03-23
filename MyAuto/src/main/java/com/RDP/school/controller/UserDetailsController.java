package com.RDP.school.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.DTO.DriverSaveDTO;
import com.RDP.school.entity.UserDetails;
import com.RDP.school.entity.VehicalDetails;
import com.RDP.school.repositry.UserDetailsRepositry;
import com.RDP.school.repositry.VehicalDetailsRepositry;

@CrossOrigin
@RestController
@RequestMapping(value = "/userDetailsController")
public class UserDetailsController<details, S> {
	
	@Autowired
	UserDetailsRepositry udrrepo;
	
	@Autowired
	VehicalDetailsRepositry vRepo;
	
	
	@RequestMapping(value = "/saveUserDetails", method = RequestMethod.POST)
	public HashMap<String, Object> saveUserDetail(@RequestBody UserDetails deta) {
		UserDetails data = udrrepo.save(deta);
		HashMap<String, Object> map = new HashMap<String , Object>();
		map.put("code", "200");
		map.put("message", "success");
		map.put("content", data);
		return map;
	}
	
	@RequestMapping(value = "/getAllUserDetails", method = RequestMethod.GET)
	public List<UserDetails> getAllUserDetails() {
		List<UserDetails> data = udrrepo.findAll();
		if(data != null && !data.isEmpty() ) {
			return data;
		}
		return null;
		
	}
	
	@RequestMapping(value = "/getUserDetailsById", method = RequestMethod.GET)
	public HashMap<String, Object>  getUserDetailsById(Long id){
		Optional<UserDetails> data = udrrepo.findById(id);
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (data.isPresent()) {
			map.put("code", "200");
			map.put("message", "success");
			map.put("content",data.get() );
			//return map;
		}else {
			map.put("code", "201");
			map.put("message", "success");
			map.put("content","no data" );
		}
		return map;
		
	}
	
	@RequestMapping(value = "/getUserDetailsByPhone", method = RequestMethod.GET)
	public HashMap<String, Object>  getUserDetailsByPhone(String phone){
		Optional<UserDetails> data = udrrepo.findByPhone(phone);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (data.isPresent()) {
			map.put("code", "200");
			map.put("message", "success");
			map.put("content",data.get() );
			//return map;
		}else {
			map.put("code", "201");
			map.put("message", "success");
			map.put("content","no data" );
		}
		return map;
		
	}
	@RequestMapping(value = "/getUserDetailsByName", method = RequestMethod.GET)
	public HashMap<String, Object>  getUserDetailsByName(String name){
		Optional<UserDetails> data = udrrepo.findByName(name);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		if (data.isPresent()) {
			map.put("code", "200");
			map.put("message", "success");
			map.put("content",data.get() );
			//return map;
		}else {
			map.put("code", "201");
			map.put("message", "success");
			map.put("content","no data" );
		}
		return map;
		
	}
	
	@RequestMapping(value = "/getUserDetailsByPhoneAndPassword", method = RequestMethod.POST)
	public HashMap<String, Object>  getUserDetailsByPhoneAndPassword(String phone,String pwsd){
		Optional<UserDetails> data = udrrepo.findByPhoneAndPassword(phone,pwsd);
		HashMap<String, Object> map = new HashMap<String , Object>();
		if (data.isPresent()) {
			map.put("code", "200");
			map.put("message", "success");
			map.put("content", data.get());
		}else{
			map.put("code", "200");
			map.put("message", "success");
		}
		return map;
		
	}
	
	
	
	
	@RequestMapping(value = "/saveDriverDetails", method = RequestMethod.POST)
	public HashMap<String, Object> saveUserDetail(@RequestBody DriverSaveDTO driverDTO) {
		//udrrepo.save(deta);
		UserDetails ud = new UserDetails();
		ud.setName(driverDTO.getName());
		ud.setPassword(driverDTO.getPassword());
		ud.setPhone(driverDTO.getPhone());
		ud.setRoleId(driverDTO.getRoleId());
		ud.setGenderId(driverDTO.getGenderId());
		ud.setProfilePhoto(driverDTO.getProfilePhoto());
		ud.setEmail(driverDTO.getEmail());
		ud.setAddress(driverDTO.getAddress());
		UserDetails userData = udrrepo.save(ud);
		
		
		VehicalDetails vd = new  VehicalDetails();
		
		vd.setDetailId(userData.getId());
		vd.setAutoNumber(driverDTO.getAutoNumber());
		vd.setAdhar(driverDTO.getAdhar());
		vd.setDlNo(driverDTO.getDlNo());
		vd.setDlPhoto(driverDTO.getDlPhoto());
		
		VehicalDetails vData = vRepo.save(vd);
		
		HashMap<String, Object> map = new HashMap<String , Object>();
		if (vData!=null) {
			map.put("code", "200");
			map.put("message", "success");
		}else{
			map.put("code", "200");
			map.put("message", "success");
		}
		return map;
	}
	

}
