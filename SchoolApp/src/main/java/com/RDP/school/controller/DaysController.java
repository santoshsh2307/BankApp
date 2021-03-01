package com.RDP.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.days;
import com.RDP.school.repositry.DaysRepositry;

@RestController
public class DaysController {
	@Autowired
	DaysRepositry drepo; 
	
	

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
}
