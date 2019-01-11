package com.lti.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreator {
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
	
	@Bean
	public Department department() {
		return new Department();
	}
	
	@Bean
	public Address address() {
		return new Address();
	}
	
	@Bean
	public NumberGenrator numberGenerator() {
		return new NumberGenrator();
	}

}
