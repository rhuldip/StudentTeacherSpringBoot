package com.rhuldip.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhuldip.dao.ICityDao;
import com.rhuldip.entity.City;
import com.rhuldip.service.ICityService;
@Service
public class CityServiceImpl implements ICityService {
	@Autowired
	private ICityDao cityDao;
	@Override
	public List<City> getAllCities() {
		return this.cityDao.getAllCities();
	}

	@Override
	public Long saveCity(City cityObj) {
		this.cityDao.saveCity(cityObj);
		return (long) 100;
	}

}
