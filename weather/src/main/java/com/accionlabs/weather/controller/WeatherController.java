package com.accionlabs.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accionlabs.weather.entity.WeatherReport;
import com.accionlabs.weather.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	WeatherService weatherService;
	
	@GetMapping("/{city}")
	public WeatherReport getWeatherReport(@PathVariable("city") String cityName) {
		
		return weatherService.getWeatherDetail(cityName);
		
		
	}
}
