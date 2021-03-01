package com.RDP.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.SchoolStaf;
import com.RDP.school.repositry.StafRepository;

@RestController
public class StaffController {
	
	@Autowired
	StafRepository stafRepo;
	
	@RequestMapping(value = "/saveStaf",method = {RequestMethod.GET})
	public SchoolStaf saveStaf(@RequestBody SchoolStaf sf) {
		stafRepo.save(sf);
		return sf;
		
	}
	@RequestMapping(value = "/getSchoolStaf", method = RequestMethod.GET)
	public List<SchoolStaf> getSchoolStaf() {
		return stafRepo.findAll();
		
	}
	@RequestMapping (value = "/getstaffById", method = RequestMethod.GET )
	public SchoolStaf getstaffById (Long id) {
	Optional<SchoolStaf> ss = stafRepo.findById(id);
	SchoolStaf ssdata = ss.get();
		return  ssdata;
	}

}
