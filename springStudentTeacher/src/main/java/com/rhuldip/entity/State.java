package com.rhuldip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "State")
public class State implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String stateName;
	
	@Id
	@Column(name = "state_id", updatable = false)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "state_name", updatable = false, unique = true, nullable = false)
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
}
