package com.lti.serviceDAO;

import org.springframework.stereotype.Service;

import com.lti.model.Employee;

@Service
public interface IEmpService {
    

	public void addEmployee(Employee e) ;
	public void delEmployee(Employee e) ;
	
}
