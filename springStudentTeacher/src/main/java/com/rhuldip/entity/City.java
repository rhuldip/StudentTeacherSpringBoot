package com.rhuldip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "City")
public class City implements Serializable{
	/**
	 * Entity class for City list
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String cityName; 
	private State state;
	
	@Id
	@Column(name = "city_id", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "city_name")
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	
	
}
