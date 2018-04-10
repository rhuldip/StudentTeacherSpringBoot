package com.rhuldip.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhuldip.dao.IStateDao;
import com.rhuldip.entity.State;
import com.rhuldip.service.IStateService;

@Service
public class StateServiceImpl implements IStateService {
	
	@Autowired
	private IStateDao stateDao;
	
	@Override
	public List<State> getAllStates() {
		return this.stateDao.getAllStates();
	}

	@Override
	public Long saveState(State stateObj) {
		return this.stateDao.saveState(stateObj);
	}

}
