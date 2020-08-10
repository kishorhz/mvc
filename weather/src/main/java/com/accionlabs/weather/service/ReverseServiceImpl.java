package com.accionlabs.weather.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseServiceImpl implements ReverseService{

	@Override
	public String getReverse(String inputString) {
		
		char[] inputArray = inputString.toCharArray();
		int length = inputArray.length;
		
		char temp = '\u0000';
		
		for(int i = 0; i < length/2 ; i++) {
			
			temp = inputArray[i];
			
			inputArray[i] = inputArray[length-(i+1)];
			
			inputArray[length-(i+1)] = temp;
			
			
		}
		String output = new String(inputArray);
		return output;
				
	}

}
