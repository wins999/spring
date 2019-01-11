package com.lti.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.DAOImpl.EmpDAOImpl;
import com.lti.model.Data;
import com.lti.model.Employee;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDAOImpl empDaoImpl  = (EmpDAOImpl)ctx.getBean("empDAOImpl");
		
		Employee employee = ctx.getBean("employee",Employee.class);
		employee.setAge(20);
		employee.setName("Amit");
		employee.setSalary(15000);
		empDaoImpl.create(employee);
		
		Employee employee1 = ctx.getBean("employee",Employee.class);
		employee1.setAge(25);
		employee1.setName("Bani");
		employee1.setSalary(25000);
		empDaoImpl.create(employee1);
		
		Employee employee2 = ctx.getBean("employee",Employee.class);
		employee2.setAge(27);
		employee2.setName("Qamini");
		employee2.setSalary(50000);
		empDaoImpl.create(employee2);	
		
		List<Employee> empList = empDaoImpl.listEmployees();
		for(Employee emp : empList) {
			System.out.println(emp);
		}

		
		//empDaoImpl.update(3, 40);
		
		Data data = ctx.getBean("data",Data.class);
		data.findSum();
		
		
		
		
	  
		


	}

}
