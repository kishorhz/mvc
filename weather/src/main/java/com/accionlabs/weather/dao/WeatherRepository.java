package com.accionlabs.weather.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accionlabs.weather.entity.WeatherReport;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherReport, Integer>{

	public WeatherReport getByCityName(String cityName);
}
