package com.lti.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.lti.model.Employee;
import com.lti.servicesImp.EmpServiceImp;

@Controller
public class EmpController {
	
	  public static void main(String[] args) {
		
		  ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		  
		  EmpServiceImp empServ = ctx.getBean("empServiceImp",EmpServiceImp.class);
		  empServ.addEmployee(new Employee());
		  
		  Employee e = ctx.getBean("employee",Employee.class);
		  empServ.delEmployee(e);
		  
	}
	

}
