package com.rhuldip.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rhuldip.dao.IGenericDao;

@Transactional
@Repository
public class GenericDaoImpl<T> implements IGenericDao<T> {

	@Override
	public List<T> getAllEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long saveEntity(T tObj) {
		// TODO Auto-generated method stub
		return null;
	}

}
