package com.rhuldip.dao;

import java.util.List;

import com.rhuldip.entity.State;

public interface IStateDao {
	public List<State> getAllStates();
	public Long saveState(State stateObj);
}
