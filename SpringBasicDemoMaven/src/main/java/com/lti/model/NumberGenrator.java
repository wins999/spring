package com.lti.model;

import org.springframework.stereotype.Component;


public class NumberGenrator {

	
	public Integer getNumber()
	{
		return (int) (Math.random()*100);
	}

}
