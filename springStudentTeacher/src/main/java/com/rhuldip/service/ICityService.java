package com.rhuldip.service;

import java.util.List;

import com.rhuldip.entity.City;

public interface ICityService {
	public List<City> getAllCities();
	public Long saveCity(City cityObj);
}
