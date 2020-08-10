package com.accionlabs.weather.service;

import com.accionlabs.weather.entity.WeatherReport;

public interface WeatherService {
	
	public WeatherReport getWeatherDetail(String cityName);

	
}
