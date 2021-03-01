package com.quest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.demo.entity.AccStatus;
import com.quest.demo.repositry.AccStatusRepositry;

@RestController
public class AccStatusController {
	@Autowired
	AccStatusRepositry asRepo;
	
	
	@RequestMapping(value = "/saveAccStatus", method = RequestMethod.GET)
	public String saveAccStatus(@RequestBody AccStatus as) {
		asRepo.save(as);
		return "save account successfully";
		
	}
}
