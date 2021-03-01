package com.quest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quest.demo.entity.BankTranjection;
import com.quest.demo.repositry.BankTranjectionrepositry;

@RestController
public class BankTranjectionController {
	@Autowired
	BankTranjectionrepositry attrepo;
	
	
	@RequestMapping (value = "/saveBankTranjection", method = RequestMethod.GET)
	public String saveBankTranjection(@RequestBody BankTranjection bt) {
		attrepo.save(bt);
		return "sava Bank tranjection details";
		
	}

}
