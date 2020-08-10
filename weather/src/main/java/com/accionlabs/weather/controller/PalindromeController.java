package com.accionlabs.weather.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accionlabs.weather.service.PalindromeService;



@RestController
@RequestMapping("/palindrom")
public class PalindromeController {
	
	@Autowired
	private PalindromeService palindromeService;

	@GetMapping("/{input}")
	public boolean isPalindrome(@PathVariable("input")String inputString) {
		
		boolean palindrome = palindromeService.isPalindrome(inputString);
		return palindrome;
	}
}
