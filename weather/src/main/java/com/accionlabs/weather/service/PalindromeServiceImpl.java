package com.accionlabs.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PalindromeServiceImpl implements PalindromeService{

	@Autowired
	ReverseService reverseService;
	
	@Override
	public boolean isPalindrome(String inputString) {
		
		String reverse = reverseService.getReverse(inputString);
		boolean equals = inputString.equals(reverse);
		return equals;
	}

}
