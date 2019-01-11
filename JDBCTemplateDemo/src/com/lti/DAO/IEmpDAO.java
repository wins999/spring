package com.lti.DAO;

import java.util.List;

import com.lti.model.Employee;

public interface IEmpDAO {

	public void create(Employee emp);
	public Employee getEmployee(int empId);
	public List listEmployees();
	public void delete(int empId);
	public void update(int empId, int age);
}
