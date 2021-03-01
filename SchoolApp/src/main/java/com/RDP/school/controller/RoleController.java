package com.RDP.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.Roles;
import com.RDP.school.repositry.RoleRepositry;


@RestController
public class RoleController {

	@Autowired
	RoleRepositry rr;
	
	@RequestMapping (value = "/saveRole", method = RequestMethod.GET)
	public String saveRole(@RequestBody Roles rl) {
		rr.save(rl);
		return "save Role successfully";
		
	}
	
	@RequestMapping (value = "/getRole", method = RequestMethod.GET)
	public List<Roles> getrole() {
		return rr.findAll();
	}
	
	@RequestMapping (value = "/getRoleById", method = RequestMethod.GET )
	public Roles getLoginById (Long id) {
	Optional<Roles> login = rr.findById(id);
	Roles lon = login.get();
		return  lon;
	}
}