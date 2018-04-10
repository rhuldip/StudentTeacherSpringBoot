package com.rhuldip.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rhuldip.dao.ICityDao;
import com.rhuldip.entity.City;

@Transactional(propagation = Propagation.REQUIRED)
@Repository
public class CityDaoImpl implements ICityDao {
	//@PersistenceContext	
	private EntityManager entityManager;
	@Override
	public List<City> getAllCities() {
		String hql = "FROM City as city";
		return (List<City>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Long saveCity(City cityObj) {
		entityManager.persist(cityObj);
		return null;
	}

}
