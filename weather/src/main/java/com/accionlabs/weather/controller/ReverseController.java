package com.accionlabs.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accionlabs.weather.service.ReverseService;

@RestController
@RequestMapping("/reverse")
public class ReverseController {
	
	@Autowired
	private ReverseService reverseService;
	
	@GetMapping("/{input}")
	public String getReverse(@PathVariable("input") String inputString) {
		
		String reverse = reverseService.getReverse(inputString);
		return reverse;
	}

}
