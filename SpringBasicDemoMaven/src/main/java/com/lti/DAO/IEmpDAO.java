package com.lti.DAO;

import org.springframework.stereotype.Repository;

import com.lti.model.Employee;

@Repository
public interface IEmpDAO {

	public void addEmployee(Employee e) ;
	public void delEmployee(Employee e) ;
	
}
