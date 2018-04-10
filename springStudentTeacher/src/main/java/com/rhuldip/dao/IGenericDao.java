package com.rhuldip.dao;

import java.util.List;

public interface IGenericDao<T> {
	public List<T> getAllEntity();
	public Long saveEntity(T tObj);
}
