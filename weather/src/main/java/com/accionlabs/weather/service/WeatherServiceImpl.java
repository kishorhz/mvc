package com.accionlabs.weather.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.accionlabs.weather.dao.WeatherRepository;
import com.accionlabs.weather.entity.Root;
import com.accionlabs.weather.entity.WeatherReport;

import reactor.core.publisher.Mono;

@Service
public class WeatherServiceImpl implements WeatherService{
	
	@Value("${openweather.apikey}")
	private String apikey;
	@Autowired
	private WeatherRepository repository;

	@Override
	public WeatherReport getWeatherDetail(String cityName) {
		
		String url ="http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&APPID="+apikey;
		
		
		RestTemplate template= new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      Root output = template.exchange(url, HttpMethod.GET, entity, Root.class).getBody();
	  if(null != output) {
		  WeatherReport weatherReport = new WeatherReport();
		  weatherReport.setCityName(output.getName());
		  weatherReport.setTemperature(output.getMain().getTemp());
		  weatherReport.setVisibility(output.getVisibility());
		  repository.save(weatherReport);
	  }
	  
		return repository.getByCityName(cityName.split(",")[0]);
		
	}

}
