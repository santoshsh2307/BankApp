package com.RDP.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.Time;
import com.RDP.school.repositry.TimeRepositry;

@RestController
public class TimeController {
	
	@Autowired
	TimeRepositry tr;
	
	
	@RequestMapping (value = "/saveTime", method = RequestMethod.GET)
	public String saveTimeTable(@RequestBody Time t) {
		tr.save(t);
		return "chinnu";
	}
	@RequestMapping (value = "/getTime", method = RequestMethod.GET)
	public List<Time>getTime () {
		return tr.findAll();
		
	}
	
	@RequestMapping (value = "/getTimeById", method = RequestMethod.GET )
	public Time getTimeById (Long id) {
	Optional<Time> ss = tr.findById(id);
	Time ssdata = ss.get();
		return  ssdata;
	}

}
