package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Address;
import com.lti.model.Department;
import com.lti.model.Employee;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = ctx.getBean("employee",Employee.class);
		
		emp.setName("Bhand");
		emp.setAdd(new Address("Street1","City1","100104"));
		emp.setRaisedSalary(50000);
		emp.setDepart(new Department("Dep1"));
		
		int id = emp.getId();
		System.out.println(id);
		
		String name = emp.getName();
		System.out.println(name);
		
		System.out.println(emp.getRaisedSalary());;
	}
}
