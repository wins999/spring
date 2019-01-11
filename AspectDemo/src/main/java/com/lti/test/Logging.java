package com.lti.test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

	@Pointcut("execution(* com.lti.model.*.get*(..))")
	private void selectAll() {                                                                
		
	}
	
	//Advices
    
 
	@Before("selectAll()") 
	private void beforeAdvice() {
		System.out.println("Goin to setup emp profile");
	}
	
	@After("selectAll()")
	private void afterAdvice() {
		System.out.println("Emp created");
	}
	
	@AfterReturning(pointcut="selectAll()", returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:"+retVal.toString());
	}
	
	@AfterThrowing(pointcut="selectAll()", throwing = "ex")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("exception :" + ex.toString());
	}
}
