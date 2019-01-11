package com.lti.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;
import com.lti.servicesImp.EmpServiceImp;

public class TestSpringEmp {
  public static void main(String[] args) {
	
	 // ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	  

	  AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	  ctx.registerShutdownHook();
	  
	  Employee e1=ctx.getBean("employee", Employee.class);
	  System.out.println(e1);
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter new name");
	  e1.setName(sc.nextLine());
	  System.out.println(e1);
	  
	  Employee e2=ctx.getBean("employee",Employee.class);
	  System.out.println(e2);
	  
	  System.out.println(e1.hashCode());

	  System.out.println(e2.hashCode());
	  
	  
	//  EmpServiceImp service = ctx.getBean("empService",EmpServiceImp.class);
	//  service.addEmployee(e1);
	  
}
  
}
