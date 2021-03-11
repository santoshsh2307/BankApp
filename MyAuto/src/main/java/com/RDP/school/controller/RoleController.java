package com.RDP.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.Role;
import com.RDP.school.entity.UserDetails;
import com.RDP.school.repositry.RoleRepository;

@RestController
public class RoleController {

	@Autowired
	RoleRepository rRepo;
	
	
	@RequestMapping(value = "/getAllRoles", method = RequestMethod.GET)
	public List<Role> getAllRoles() {
		List<Role> data = rRepo.findAll();
		if(data != null && !data.isEmpty() ) {
			return data;
		}
		return null;
		
	}
	
	@RequestMapping(value = "/getRoleById", method = RequestMethod.GET)
	public Role  getRoleById(Long id){
		Optional<Role> data = rRepo.findById(id);
		if (data.isPresent()) {
			return data.get();
		}
		return null;
		
	}
}
