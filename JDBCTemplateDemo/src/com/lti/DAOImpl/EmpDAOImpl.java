package com.lti.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.lti.DAO.IEmpDAO;
import com.lti.model.Employee;
import com.lti.model.EmployeeMapper;

@Component
public class EmpDAOImpl implements IEmpDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
    public void setjdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
	   this.jdbcTemplateObject = jdbcTemplateObject;
    }

	@Override
	public void create(Employee emp) {
		// TODO Auto-generated method stub
		String query = "insert into Employeee(name,age,salary)values(?,?,?)";
		jdbcTemplateObject.update(query,new Object[] {emp.getName(),emp.getAge(),emp.getSalary()});
	   System.out.println("Emp Created : " +emp.getName()+" having age :"+emp.getAge()+" with salary :"+emp.getSalary());	
	   
		
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		String query = "select * from Employeee where id = ?";
		Employee employee = (Employee)jdbcTemplateObject.queryForObject(query,new Object[] {empId},new EmployeeMapper());
		return employee;
	}

	@Override
	public List listEmployees() {
		// TODO Auto-generated method stub
		String query = "select * from Employeee";
		List empList = (List)jdbcTemplateObject.query(query,new Object[] {},new EmployeeMapper());
		return empList;
	}

	@Override
	public void delete(int empId) {
		// TODO Auto-generated method stub
		String query = "delete from Employeee where id = ?";
		jdbcTemplateObject.update(query,new Object[] {empId});
		System.out.println("Deleted Employee with empId :"+empId);
	}

	@Override
	public void update(int empId, int age) {
		// TODO Auto-generated method stub
		String query = "update Employeee set age = ? where id = ?";
		jdbcTemplateObject.update(query,new Object[] {age,empId});
		System.out.println("Updated Employee with empId :"+empId);
		
	}

}
