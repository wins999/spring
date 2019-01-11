package com.lti.servicesImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.DAOImp.EmpDAOImp;
import com.lti.model.Employee;
import com.lti.serviceDAO.IEmpService;

@Service
public class EmpServiceImp implements IEmpService{
	@Autowired
	EmpDAOImp empDAOImp;
	
	public void addEmployee(Employee e) {
		
		empDAOImp.addEmployee(e);
	}

	public void delEmployee(Employee e) {
		// TODO Auto-generated method stub
		empDAOImp.delEmployee(e);
	}
	
}
