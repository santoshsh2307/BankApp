package com.quest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.demo.entity.AcctDetail;
import com.quest.demo.repositry.AccDetailrepositry;

@RestController
public class AccDetailController {
	@Autowired
	AccDetailrepositry adrepo;
	
	
	
	
	@RequestMapping (value = "/saveAccDeail", method = RequestMethod.GET)
	public String saveAccDetail(@RequestBody AcctDetail ad) {
		adrepo.save(ad);
		
		return "save account detail";
	}

}
