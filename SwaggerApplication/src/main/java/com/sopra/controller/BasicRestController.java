package com.sopra.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.Sport;

@RequestMapping("/api")
@RestController
public class BasicRestController {
	List<Sport> sports = new ArrayList<Sport>();
	{
		sports.add(new Sport(1,"Cricket", "11"));
		sports.add(new Sport(2,"Hockey", "11"));
		sports.add(new Sport(3,"Tennis", "2"));
		sports.add(new Sport(4,"Kabaddi", "7"));
	}


	@RequestMapping(value = "/getSports", method = RequestMethod.GET, produces = "application/json")
	public List<Sport> getSports() {
		return sports;
	}

	@RequestMapping(value = "/getSport/{id}", method = RequestMethod.GET, produces = "application/json")
	public Sport getSportById(@PathVariable(value = "id") int id) {
		return sports.stream().filter(x -> x.getId()==(id)).collect(Collectors.toList()).get(0);
	}

	@RequestMapping(value = "/getSport/noOfPlayers/{no}", method = RequestMethod.GET, produces = "application/json")
	public List<Sport> getSportByNoOfPlayers(@PathVariable(value = "no") String no) {
		return sports.stream().filter(x -> x.getNoofPlayer().equalsIgnoreCase(no))
				.collect(Collectors.toList());
	}

}