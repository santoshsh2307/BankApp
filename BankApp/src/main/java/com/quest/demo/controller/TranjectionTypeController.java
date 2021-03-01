package com.quest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.demo.entity.TranjectionType;
import com.quest.demo.repositry.TranjectiontypeRepositry;

@RestController
public class TranjectionTypeController {
	@Autowired
	TranjectiontypeRepositry trc;
	
	@RequestMapping (value = "/saveTranjectiontype", method = RequestMethod.GET)
	
	public String saveTranjectionType(@RequestBody TranjectionType tr) {
		
		trc.save(tr);
		return "save Tranjection Type";

		
		
	}

}
