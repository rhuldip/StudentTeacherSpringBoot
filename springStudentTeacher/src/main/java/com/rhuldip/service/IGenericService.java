package com.rhuldip.service;

import java.util.List;

public interface IGenericService<T> {
	public List<T> getAllEntity();
	public Long saveEntity(T tObj);
}
