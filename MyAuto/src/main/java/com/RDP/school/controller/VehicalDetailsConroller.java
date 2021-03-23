package com.RDP.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.DTO.DriverDTO;
import com.RDP.school.DTO.DriverDTO1;
import com.RDP.school.entity.VehicalDetails;
import com.RDP.school.repositry.VehicalDetailsRepositry;

@RestController
@RequestMapping(value = "VehicalDetailsController")
public class VehicalDetailsConroller {
	
	@Autowired
	VehicalDetailsRepositry vdrrepo;
	
	@RequestMapping(value = "/savaVehicalDetails", method = RequestMethod.GET)
	public String saveTrip(@RequestBody VehicalDetails vd) {
		vdrrepo.save(vd);
		return "sucess";
	}
	
	@RequestMapping(value = "/getAllVehicalDetails", method = RequestMethod.GET)
	public List<VehicalDetails> getAllVehicalDetails() {
		List<VehicalDetails> data = vdrrepo.findAll();
		if(data != null && !data.isEmpty() ) {
			return data;
		}
		return null;
	}
	
	@RequestMapping(value = "/getVehicalDetailsById", method = RequestMethod.GET)
	public VehicalDetails  getVehicalDetailsById(Long id){
		Optional<VehicalDetails> data = vdrrepo.findById(id);
		if (data.isPresent()) {
			return data.get();
		}
		return null;
	}
	
	@RequestMapping(value = "/getVehicalsDetailsautoNumber", method = RequestMethod.GET)
	public VehicalDetails  getVehicalsDetailsautoNumber(String autoNomber){
		Optional<VehicalDetails> data =vdrrepo.findByAutoNumber(autoNomber);
		if (data.isPresent()) {
			return data.get();
		}
		return null;
	}
	
	@RequestMapping(value = "/getVehicalDetailsByAdhar", method = RequestMethod.GET)
	public VehicalDetails  getVehicalDetailsByAdhar(String adhar){
		Optional<VehicalDetails> data = vdrrepo.findByAdhar(adhar);
		if (data.isPresent()) {
			return data.get();
		}
		return null;
	
	}
	
	
	@RequestMapping(value = "/getDriverDetailsByAutoNumber", method = RequestMethod.GET)
	public DriverDTO1  getDriverDetailsByAutoNumber(String autoNumber){
		DriverDTO1 data = vdrrepo.getDriverDetailsByAutoNumber(autoNumber);
		if (data!=null) {
			return data;
		}
		return null;
	}
	
}

