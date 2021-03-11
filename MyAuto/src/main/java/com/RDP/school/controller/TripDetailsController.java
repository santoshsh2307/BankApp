package com.RDP.school.controller;

import java.lang.Thread.State;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.Status;
import com.RDP.school.entity.TripDetails;
import com.RDP.school.entity.UserDetails;
import com.RDP.school.repositry.TripRepositry;
import com.RDP.school.repositry.UserDetailsRepositry;

@RestController
@RequestMapping (value = "tripController")
public class TripDetailsController {
	
	@Autowired
	TripRepositry trrepo;
	
	

	@RequestMapping(value = "/saveTrip", method = RequestMethod.POST)
	public String saveTrip(@RequestBody TripDetails td) {
		trrepo.save(td);
		return "success"; 
	}
	@RequestMapping(value = "/getAllTrips", method = RequestMethod.GET)
	public List<TripDetails> getAllTrips() {
		List<TripDetails> tripData = trrepo.findAll();
		
		//List<UserDetails> userdata = udr.findAll();
		if (tripData !=null && !tripData.isEmpty()) {
			return tripData;
		}
		return null;
	}
	
	@RequestMapping(value = "/getTripsById", method = RequestMethod.GET)
	public TripDetails getTripsById(Long id) {
		  Optional<TripDetails> data = trrepo.findById(id);
		if (data.isPresent()) {
			return data.get();
		}
		return null;
	}
	@RequestMapping(value = "/getStatusId", method = RequestMethod.GET)
	public List<TripDetails> getStatusId (Long statusid) {
		  List <TripDetails> data = trrepo.findByStatus(statusid);
		if (data !=null && !data.isEmpty()) {
			return data;
		}
		return null;
	}
	
	
}
