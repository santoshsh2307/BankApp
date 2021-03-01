package com.quest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.demo.entity.AccType;
import com.quest.demo.repositry.AccTypeRepositry;

@RestController
public class AccTypeController {
	@Autowired
	AccTypeRepositry atrepo;
	
	@RequestMapping (value = "/saveAccType", method = RequestMethod.GET)
	public String saveAccType(@RequestBody AccType at) {
		
		atrepo.save(at);
		return "save Account type";
		
	}

}
