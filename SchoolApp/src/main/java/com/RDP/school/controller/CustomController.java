package com.RDP.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.repositry.DaysRepositry;

@RestController
public class CustomController {

	@Autowired
	DaysRepositry drepo;	
	
	@RequestMapping(value = "/stafDetail", method = RequestMethod.GET)
	public Object stafDetail(Long stafId) {
	Object data = drepo.stafDetail(stafId);
	return data;
	}

}
