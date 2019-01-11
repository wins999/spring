package com.lti.DAOImp;

import org.springframework.stereotype.Repository;

import com.lti.DAO.IEmpDAO;
import com.lti.model.Employee;

@Repository
public class EmpDAOImp  implements IEmpDAO   {

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("employee added...!!!");
	}

	@Override
	public void delEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("employee deleted...!!!");
	}

}
