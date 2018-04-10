package com.rhuldip.dao;

import java.util.List;

import com.rhuldip.entity.City;

public interface ICityDao {
	public List<City> getAllCities();
	public Long saveCity(City cityObj);
}
