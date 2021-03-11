package com.RDP.school.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.UserDetails;
import com.RDP.school.repositry.UserDetailsRepositry;

@RestController
@RequestMapping(value = "/userDetailsController")
public class UserDetailsController<details, S> {
	
	@Autowired
	UserDetailsRepositry udrrepo;
	
	
	@RequestMapping(value = "/saveUserDetails", method = RequestMethod.GET)
	public String saveUserDetail(@RequestBody UserDetails deta) {
		udrrepo.save(deta);
		return "success";
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
	public UserDetails  getUserDetailsById(Long id){
		Optional<UserDetails> data = udrrepo.findById(id);
		if (data.isPresent()) {
			return data.get();
		}
		return null;
		
	}
	
	@RequestMapping(value = "/getUserDetailsByPhone", method = RequestMethod.GET)
	public UserDetails  getUserDetailsByPhone(String phone){
		Optional<UserDetails> data = udrrepo.findByPhone(phone);
		if (data.isPresent()) {
			return data.get();
		}
		return null;
		
	}
	@RequestMapping(value = "/getUserDetailsByName", method = RequestMethod.GET)
	public UserDetails  getUserDetailsByName(String name){
		Optional<UserDetails> data = udrrepo.findByName(name);
		if (data.isPresent()) {
			return data.get();
		}
		return null;
		
	}
	

}
