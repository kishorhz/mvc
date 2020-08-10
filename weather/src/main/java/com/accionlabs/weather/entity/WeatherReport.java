package com.accionlabs.weather.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="report")
public class WeatherReport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="city_name")
	private String cityName;
	
	@Column(name="temperature")
	private double temperature;
	
	@Column(name="visibility")
	private long visibility;

	public WeatherReport() {
		
	}
	
	public WeatherReport(String cityName, double temperature, long visibility) {
		this.cityName = cityName;
		this.temperature = temperature;
		this.visibility = visibility;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	

	public long getVisibility() {
		return visibility;
	}

	public void setVisibility(long visibility) {
		this.visibility = visibility;
	}

	@Override
	public String toString() {
		return "WeatherReport [id=" + id + ", cityName=" + cityName + ", temperature=" + temperature +", visibility=" + visibility + "]";
	}

	
	
	
}
