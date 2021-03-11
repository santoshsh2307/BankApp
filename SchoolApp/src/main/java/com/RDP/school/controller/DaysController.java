package com.RDP.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.Roles;
import com.RDP.school.entity.SchoolStaf;
import com.RDP.school.entity.days;
import com.RDP.school.repositry.DaysRepositry;
import com.RDP.school.repositry.RoleRepositry;
import com.RDP.school.repositry.StafRepository;

@RestController
@RequestMapping(value = "dayController")
public class DaysController {
	
	@Autowired
	DaysRepositry drepo; 
	
	@Autowired
	RoleRepositry rr;
	
	@Autowired
	StafRepository sr;
	
	
	

	@RequestMapping(value = "/saveDays" , method = RequestMethod.GET)
	public String saveDays(@RequestBody days day) {
		drepo.save(day);
		return "success";
		
	}
	
	@RequestMapping(value = "/getDays",method = RequestMethod.GET)
	public List<days> getDays() {
		List<days> d = drepo.findAll();
		return d;
	}
	
	@RequestMapping(value = "/getDaysById",method = RequestMethod.GET)
	public days getDaysById(Long id) {
		Optional<days> d = drepo.findById(id);
		days day = d.get();
		return day;
	}
	
	
	@RequestMapping(value = "/getDaysByDay",method = RequestMethod.GET)
	public days getDaysByDay(String day) {
		Optional<days> d = drepo.findByDay(day);
		days da = d.get();
		return da;
	}
	
	
	@RequestMapping(value = "/getRole",method = RequestMethod.GET)
	public List<Roles> getRole() {
		List<Roles> d = rr.findAll();
		return d;
	}
	
	@RequestMapping(value = "/getRoleByuName",method = RequestMethod.GET)
	public Roles getRoleByuName(String name) {
		Optional<Roles> d = rr.findByName(name);
		Roles da = d.get();
		return da;
	}
	@RequestMapping (value = "/findByStafName",method = RequestMethod.GET)
	public SchoolStaf findByStafName(String name) {
		Optional<SchoolStaf> data = sr.findByUserIdName(name);
		return data.get();
		
	}
	
	
	
}
