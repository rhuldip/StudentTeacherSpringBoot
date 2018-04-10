package com.rhuldip.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.rhuldip.dao.IStateDao;
import com.rhuldip.entity.State;

@Repository
public class StateDaoImpl implements IStateDao {
	
	private EntityManager entityManager;
	
	@Override
	public List<State> getAllStates() {
		String hql = "FROM State as state";
		return (List<State>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Long saveState(State stateObj) {
		this.entityManager.persist(stateObj);
		return null;
	}

}
