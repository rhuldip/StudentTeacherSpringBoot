package com.rhuldip.service;

import java.util.List;

import com.rhuldip.entity.State;


public interface IStateService {
	public List<State> getAllStates();
	public Long saveState(State stateObj);
}
