package com.RDP.school.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RDP.school.entity.SchoolStaf;
import com.RDP.school.entity.Time;
import com.RDP.school.repositry.StafRepository;
import com.RDP.school.repositry.TimeRepositry;

@RestController
@RequestMapping(value = "/santosh")
public class TimeController {
	
	@Autowired
	TimeRepositry tr;
	
	@Autowired
	StafRepository sr;
	
	@RequestMapping (value = "/saveTime", method = RequestMethod.GET)
	public String saveTimeTable(@RequestBody Time t) {
		tr.save(t);
		return "chinnu";
	}
	@RequestMapping (value = "/getTime", method = RequestMethod.GET)
	public List<Time>getTime () {
		return tr.findAll();
		
	}
	
	@RequestMapping (value = "/getTimeBysub", method = RequestMethod.GET )
	public Object getTimeBydayId (String sub,Long standerd) {
	Optional<Time> ss = tr.findBysubAndStanderd(sub, standerd);
	// SchoolStaf d = findBySchoolStafId(ss.get().getStafId());
	// List<Time> t = getTime();
	// System.out.println(d.getUserIdName());
	if(ss.isPresent()) {
		Time ssdata = ss.get();
		return  ssdata;
	}
	return "no data found";
	}
	
	@RequestMapping (value = "/findBySchoolStafId", method = RequestMethod.GET)
	public SchoolStaf  findBySchoolStafId(Long id) {
		Optional<SchoolStaf> data = sr.findById(id);
		return data.get();
	}

	
}
