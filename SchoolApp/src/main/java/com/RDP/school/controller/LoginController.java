package com.RDP.school.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.login;
import com.RDP.school.repositry.LoginRepositry;

@RestController
public class LoginController {

	@Autowired
	LoginRepositry loginrepo;
	
	@RequestMapping(value = "/saveLogin" , method = RequestMethod.GET)
	public String saveLogin(@RequestBody login l) {
		loginrepo.save(l);
		return "test";
		
	}
	@RequestMapping(value = "/getLogin", method = RequestMethod.GET)
	public List<login> getlogin() {
		
	List<login> l = loginrepo.findAll();
	return l;
					
	}
	
	@RequestMapping (value = "/getLoginById", method = RequestMethod.GET )
	public login getLoginById (Long Id) {
	Optional<login> login = loginrepo.findById(Id);
	 login lon = login.get();
		return  lon;
	}
	
}
