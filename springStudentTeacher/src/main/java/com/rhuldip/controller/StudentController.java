package com.rhuldip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rhuldip.entity.City;
import com.rhuldip.service.ICityService;

@RestController
public class StudentController {
	
	@Autowired 
	private ICityService cityService;
	
	@GetMapping("state")
	public @ResponseBody String city() {
		City cityObj = new City();
		cityObj.setCityName("BANGALORE");
		try {
			this.cityService.saveCity(cityObj);
			return "SUCCESS";
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return ex.getMessage();
		}
	}
	@RequestMapping(value = "/getcity", method = RequestMethod.GET)
	public @ResponseBody List<City> cities() {
		try {
			return this.cityService.getAllCities();
		}
		catch(Exception ex) {
			return null;
		}
	}
	@GetMapping("test1")
	public @ResponseBody String test() {
		return "Deep";
	}

}
